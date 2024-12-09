package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysSalary;
import com.ruoyi.system.service.ISysSalaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工资查询表Controller
 * 
 * @author 龙春杰
 * @date 2023-11-14
 */
@Controller
@RequestMapping("/system/salary")
public class SysSalaryController extends BaseController
{
    private String prefix = "system/salary";

    @Autowired
    private ISysSalaryService sysSalaryService;

    @RequiresPermissions("system:salary:view")
    @GetMapping()
    public String salary()
    {
        return prefix + "/salary";
    }

    /**
     * 查询工资查询表列表
     */
    @RequiresPermissions("system:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysSalary sysSalary)
    {
        startPage();
        List<SysSalary> list = sysSalaryService.selectSysSalaryList(sysSalary);
        return getDataTable(list);
    }

    /**
     * 导出工资查询表列表
     */
    @RequiresPermissions("system:salary:export")
    @Log(title = "工资查询表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysSalary sysSalary)
    {
        List<SysSalary> list = sysSalaryService.selectSysSalaryList(sysSalary);
        ExcelUtil<SysSalary> util = new ExcelUtil<SysSalary>(SysSalary.class);
        return util.exportExcel(list, "工资查询表数据");
    }

    /**
     * 新增工资查询表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工资查询表
     */
    @RequiresPermissions("system:salary:add")
    @Log(title = "工资查询表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysSalary sysSalary)
    {
        return toAjax(sysSalaryService.insertSysSalary(sysSalary));
    }

    /**
     * 修改工资查询表
     */
    @RequiresPermissions("system:salary:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysSalary sysSalary = sysSalaryService.selectSysSalaryById(id);
        mmap.put("sysSalary", sysSalary);
        return prefix + "/edit";
    }

    /**
     * 修改保存工资查询表
     */
    @RequiresPermissions("system:salary:edit")
    @Log(title = "工资查询表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysSalary sysSalary)
    {
        return toAjax(sysSalaryService.updateSysSalary(sysSalary));
    }

    /**
     * 删除工资查询表
     */
    @RequiresPermissions("system:salary:remove")
    @Log(title = "工资查询表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysSalaryService.deleteSysSalaryByIds(ids));
    }
}
