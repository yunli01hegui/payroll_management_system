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
import com.ruoyi.system.domain.SysSalaryStandard;
import com.ruoyi.system.service.ISysSalaryStandardService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 薪资标准Controller
 * 
 * @author long
 * @date 2023-11-14
 */
@Controller
@RequestMapping("/system/standard")
public class SysSalaryStandardController extends BaseController
{
    private String prefix = "system/standard";

    @Autowired
    private ISysSalaryStandardService sysSalaryStandardService;

    @RequiresPermissions("system:standard:view")
    @GetMapping()
    public String standard()
    {
        return prefix + "/standard";
    }

    /**
     * 查询薪资标准列表
     */
    @RequiresPermissions("system:standard:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysSalaryStandard sysSalaryStandard)
    {
        startPage();
        List<SysSalaryStandard> list = sysSalaryStandardService.selectSysSalaryStandardList(sysSalaryStandard);
        return getDataTable(list);
    }

    /**
     * 导出薪资标准列表
     */
    @RequiresPermissions("system:standard:export")
    @Log(title = "薪资标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysSalaryStandard sysSalaryStandard)
    {
        List<SysSalaryStandard> list = sysSalaryStandardService.selectSysSalaryStandardList(sysSalaryStandard);
        ExcelUtil<SysSalaryStandard> util = new ExcelUtil<SysSalaryStandard>(SysSalaryStandard.class);
        return util.exportExcel(list, "薪资标准数据");
    }

    /**
     * 新增薪资标准
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存薪资标准
     */
    @RequiresPermissions("system:standard:add")
    @Log(title = "薪资标准", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysSalaryStandard sysSalaryStandard)
    {
        return toAjax(sysSalaryStandardService.insertSysSalaryStandard(sysSalaryStandard));
    }

    /**
     * 修改薪资标准
     */
    @RequiresPermissions("system:standard:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysSalaryStandard sysSalaryStandard = sysSalaryStandardService.selectSysSalaryStandardById(id);
        mmap.put("sysSalaryStandard", sysSalaryStandard);
        return prefix + "/edit";
    }

    /**
     * 修改保存薪资标准
     */
    @RequiresPermissions("system:standard:edit")
    @Log(title = "薪资标准", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysSalaryStandard sysSalaryStandard)
    {
        return toAjax(sysSalaryStandardService.updateSysSalaryStandard(sysSalaryStandard));
    }

    /**
     * 删除薪资标准
     */
    @RequiresPermissions("system:standard:remove")
    @Log(title = "薪资标准", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysSalaryStandardService.deleteSysSalaryStandardByIds(ids));
    }
}
