package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSalaryStandard;

/**
 * 薪资标准Mapper接口
 * 
 * @author long
 * @date 2023-11-14
 */
public interface SysSalaryStandardMapper 
{
    /**
     * 查询薪资标准
     * 
     * @param id 薪资标准主键
     * @return 薪资标准
     */
    public SysSalaryStandard selectSysSalaryStandardById(Long id);

    /**
     * 查询薪资标准列表
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 薪资标准集合
     */
    public List<SysSalaryStandard> selectSysSalaryStandardList(SysSalaryStandard sysSalaryStandard);

    /**
     * 新增薪资标准
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 结果
     */
    public int insertSysSalaryStandard(SysSalaryStandard sysSalaryStandard);

    /**
     * 修改薪资标准
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 结果
     */
    public int updateSysSalaryStandard(SysSalaryStandard sysSalaryStandard);

    /**
     * 删除薪资标准
     * 
     * @param id 薪资标准主键
     * @return 结果
     */
    public int deleteSysSalaryStandardById(Long id);

    /**
     * 批量删除薪资标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSalaryStandardByIds(String[] ids);
}