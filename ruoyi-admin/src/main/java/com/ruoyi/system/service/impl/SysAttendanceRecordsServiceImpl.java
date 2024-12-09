package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAttendanceRecordsMapper;
import com.ruoyi.system.domain.SysAttendanceRecords;
import com.ruoyi.system.service.ISysAttendanceRecordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 考勤记录Service业务层处理
 * 
 * @author 龙春杰
 * @date 2023-10-30
 */
@Service
public class SysAttendanceRecordsServiceImpl implements ISysAttendanceRecordsService 
{
    @Autowired
    private SysAttendanceRecordsMapper sysAttendanceRecordsMapper;

    /**
     * 查询考勤记录
     * 
     * @param id 考勤记录主键
     * @return 考勤记录
     */
    @Override
    public SysAttendanceRecords selectSysAttendanceRecordsById(Long id)
    {
        return sysAttendanceRecordsMapper.selectSysAttendanceRecordsById(id);
    }

    /**
     * 查询考勤记录列表
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 考勤记录
     */
    @Override
    public List<SysAttendanceRecords> selectSysAttendanceRecordsList(SysAttendanceRecords sysAttendanceRecords)
    {
        return sysAttendanceRecordsMapper.selectSysAttendanceRecordsList(sysAttendanceRecords);
    }

    /**
     * 新增考勤记录
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 结果
     */
    @Override
    public int insertSysAttendanceRecords(SysAttendanceRecords sysAttendanceRecords)
    {
        return sysAttendanceRecordsMapper.insertSysAttendanceRecords(sysAttendanceRecords);
    }

    /**
     * 修改考勤记录
     * 
     * @param sysAttendanceRecords 考勤记录
     * @return 结果
     */
    @Override
    public int updateSysAttendanceRecords(SysAttendanceRecords sysAttendanceRecords)
    {
        return sysAttendanceRecordsMapper.updateSysAttendanceRecords(sysAttendanceRecords);
    }

    /**
     * 批量删除考勤记录
     * 
     * @param ids 需要删除的考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteSysAttendanceRecordsByIds(String ids)
    {
        return sysAttendanceRecordsMapper.deleteSysAttendanceRecordsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除考勤记录信息
     * 
     * @param id 考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteSysAttendanceRecordsById(Long id)
    {
        return sysAttendanceRecordsMapper.deleteSysAttendanceRecordsById(id);
    }
}
