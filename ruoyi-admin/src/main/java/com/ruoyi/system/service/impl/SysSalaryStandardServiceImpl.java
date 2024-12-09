package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSalaryStandardMapper;
import com.ruoyi.system.domain.SysSalaryStandard;
import com.ruoyi.system.service.ISysSalaryStandardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 薪资标准Service业务层处理
 * 
 * @author long
 * @date 2023-11-14
 */
@Service
public class SysSalaryStandardServiceImpl implements ISysSalaryStandardService 
{
    @Autowired
    private SysSalaryStandardMapper sysSalaryStandardMapper;

    /**
     * 查询薪资标准
     * 
     * @param id 薪资标准主键
     * @return 薪资标准
     */
    @Override
    public SysSalaryStandard selectSysSalaryStandardById(Long id)
    {
        return sysSalaryStandardMapper.selectSysSalaryStandardById(id);
    }

    /**
     * 查询薪资标准列表
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 薪资标准
     */
    @Override
    public List<SysSalaryStandard> selectSysSalaryStandardList(SysSalaryStandard sysSalaryStandard)
    {
        return sysSalaryStandardMapper.selectSysSalaryStandardList(sysSalaryStandard);
    }

    /**
     * 新增薪资标准
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 结果
     */
    @Override
    public int insertSysSalaryStandard(SysSalaryStandard sysSalaryStandard)
    {
        return sysSalaryStandardMapper.insertSysSalaryStandard(sysSalaryStandard);
    }

    /**
     * 修改薪资标准
     * 
     * @param sysSalaryStandard 薪资标准
     * @return 结果
     */
    @Override
    public int updateSysSalaryStandard(SysSalaryStandard sysSalaryStandard)
    {
        return sysSalaryStandardMapper.updateSysSalaryStandard(sysSalaryStandard);
    }

    /**
     * 批量删除薪资标准
     * 
     * @param ids 需要删除的薪资标准主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryStandardByIds(String ids)
    {
        return sysSalaryStandardMapper.deleteSysSalaryStandardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除薪资标准信息
     * 
     * @param id 薪资标准主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryStandardById(Long id)
    {
        return sysSalaryStandardMapper.deleteSysSalaryStandardById(id);
    }
}
