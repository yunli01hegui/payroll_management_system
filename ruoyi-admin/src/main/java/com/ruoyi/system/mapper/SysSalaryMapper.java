package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSalary;

/**
 * 工资查询表Mapper接口
 * 
 * @author 龙春杰
 * @date 2023-11-14
 */
public interface SysSalaryMapper 
{
    /**
     * 查询工资查询表
     * 
     * @param id 工资查询表主键
     * @return 工资查询表
     */
    public SysSalary selectSysSalaryById(Long id);

    /**
     * 查询工资查询表列表
     * 
     * @param sysSalary 工资查询表
     * @return 工资查询表集合
     */
    public List<SysSalary> selectSysSalaryList(SysSalary sysSalary);

    /**
     * 新增工资查询表
     * 
     * @param sysSalary 工资查询表
     * @return 结果
     */
    public int insertSysSalary(SysSalary sysSalary);

    /**
     * 修改工资查询表
     * 
     * @param sysSalary 工资查询表
     * @return 结果
     */
    public int updateSysSalary(SysSalary sysSalary);

    /**
     * 删除工资查询表
     * 
     * @param id 工资查询表主键
     * @return 结果
     */
    public int deleteSysSalaryById(Long id);

    /**
     * 批量删除工资查询表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSalaryByIds(String[] ids);
}
