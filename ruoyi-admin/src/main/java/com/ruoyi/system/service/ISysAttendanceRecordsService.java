package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAttendanceRecords;

/**
 * 考勤记录Service接口
 * 
 * @author 龙春杰
 * @date 2023-10-30
 */
public interface ISysAttendanceRecordsService 
{
    /**
     * 查询考勤记录
     * 
     * @param id 考勤记录主键
     * @return 考勤记录
     */
    public SysAttendanceRecords selectSysAttendanceRecordsById(Long id);

    /**
     * 查询考勤记录列表
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 考勤记录集合
     */
    public List<SysAttendanceRecords> selectSysAttendanceRecordsList(SysAttendanceRecords sysAttendanceRecords);

    /**
     * 新增考勤记录
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 结果
     */
    public int insertSysAttendanceRecords(SysAttendanceRecords sysAttendanceRecords);

    /**
     * 修改考勤记录
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 结果
     */
    public int updateSysAttendanceRecords(SysAttendanceRecords sysAttendanceRecords);

    /**
     * 批量删除考勤记录
     * 
     * @param ids 需要删除的考勤记录主键集合
     * @return 结果
     */
    public int deleteSysAttendanceRecordsByIds(String ids);

    /**
     * 删除考勤记录信息
     * 
     * @param id 考勤记录主键
     * @return 结果
     */
    public int deleteSysAttendanceRecordsById(Long id);
}
