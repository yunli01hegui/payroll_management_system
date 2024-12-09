package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysAttendanceRecords;

/**
 * 考勤记录Mapper接口
 * 
 * @author 龙春杰
 * @date 2023-10-30
 */
public interface SysAttendanceRecordsMapper 
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
     * 删除考勤记录
     * 
     * @param id 考勤记录主键
     * @return 结果
     */
    public int deleteSysAttendanceRecordsById(Long id);

    /**
     * 批量删除考勤记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAttendanceRecordsByIds(String[] ids);
}
