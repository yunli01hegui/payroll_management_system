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
import com.ruoyi.system.domain.SysAttendanceRecords;
import com.ruoyi.system.service.ISysAttendanceRecordsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考勤记录Controller
 * 
 * @author 龙春杰
 * @date 2023-10-30
 */
@Controller
@RequestMapping("/system/records")
public class SysAttendanceRecordsController extends BaseController
{
    private String prefix = "system/records";

    @Autowired
    private ISysAttendanceRecordsService sysAttendanceRecordsService;

    @RequiresPermissions("system:records:view")
    @GetMapping()
    public String records()
    {
        return prefix + "/records";
    }

    /**
     * 查询考勤记录列表
     */
    @RequiresPermissions("system:records:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysAttendanceRecords sysAttendanceRecords)
    {
        startPage();
        List<SysAttendanceRecords> list = sysAttendanceRecordsService.selectSysAttendanceRecordsList(sysAttendanceRecords);
        return getDataTable(list);
    }

    /**
     * 导出考勤记录列表
     */
    @RequiresPermissions("system:records:export")
    @Log(title = "考勤记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysAttendanceRecords sysAttendanceRecords)
    {
        List<SysAttendanceRecords> list = sysAttendanceRecordsService.selectSysAttendanceRecordsList(sysAttendanceRecords);
        ExcelUtil<SysAttendanceRecords> util = new ExcelUtil<SysAttendanceRecords>(SysAttendanceRecords.class);
        return util.exportExcel(list, "考勤记录数据");
    }

    /**
     * 新增考勤记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存考勤记录
     */
    @RequiresPermissions("system:records:add")
    @Log(title = "考勤记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysAttendanceRecords sysAttendanceRecords)
    {
        return toAjax(sysAttendanceRecordsService.insertSysAttendanceRecords(sysAttendanceRecords));
    }

    /**
     * 修改考勤记录
     */
    @RequiresPermissions("system:records:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysAttendanceRecords sysAttendanceRecords = sysAttendanceRecordsService.selectSysAttendanceRecordsById(id);
        mmap.put("sysAttendanceRecords", sysAttendanceRecords);
        return prefix + "/edit";
    }

    /**
     * 修改保存考勤记录
     */
    @RequiresPermissions("system:records:edit")
    @Log(title = "考勤记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysAttendanceRecords sysAttendanceRecords)
    {
        return toAjax(sysAttendanceRecordsService.updateSysAttendanceRecords(sysAttendanceRecords));
    }

    /**
     * 删除考勤记录
     */
    @RequiresPermissions("system:records:remove")
    @Log(title = "考勤记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysAttendanceRecordsService.deleteSysAttendanceRecordsByIds(ids));
    }
}
