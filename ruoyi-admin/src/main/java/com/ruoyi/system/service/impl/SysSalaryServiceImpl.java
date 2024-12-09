package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSalaryMapper;
import com.ruoyi.system.domain.SysSalary;
import com.ruoyi.system.service.ISysSalaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工资查询表Service业务层处理
 * 
 * @author 龙春杰
 * @date 2023-11-14
 */
@Service
public class SysSalaryServiceImpl implements ISysSalaryService 
{
    @Autowired
    private SysSalaryMapper sysSalaryMapper;

    /**
     * 查询工资查询表
     * 
     * @param id 工资查询表主键
     * @return 工资查询表
     */
    @Override
    public SysSalary selectSysSalaryById(Long id)
    {
        return sysSalaryMapper.selectSysSalaryById(id);
    }

    /**
     * 查询工资查询表列表
     * 
     * @param sysSalary 工资查询表
     * @return 工资查询表
     */
    @Override
    public List<SysSalary> selectSysSalaryList(SysSalary sysSalary)
    {
        return sysSalaryMapper.selectSysSalaryList(sysSalary);
    }

    /**
     * 新增工资查询表
     * 
     * @param sysSalary 工资查询表
     * @return 结果
     */
    @Override
    public int insertSysSalary(SysSalary sysSalary)
    {
        return sysSalaryMapper.insertSysSalary(sysSalary);
    }

    /**
     * 修改工资查询表
     * 
     * @param sysSalary 工资查询表
     * @return 结果
     */
    @Override
    public int updateSysSalary(SysSalary sysSalary)
    {
        return sysSalaryMapper.updateSysSalary(sysSalary);
    }

    /**
     * 批量删除工资查询表
     * 
     * @param ids 需要删除的工资查询表主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryByIds(String ids)
    {
        return sysSalaryMapper.deleteSysSalaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工资查询表信息
     * 
     * @param id 工资查询表主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryById(Long id)
    {
        return sysSalaryMapper.deleteSysSalaryById(id);
    }
}
