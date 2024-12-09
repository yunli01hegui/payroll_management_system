package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 薪资标准对象 sys_salary_standard
 * 
 * @author long
 * @date 2023-11-14
 */
public class SysSalaryStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标准ID */
    private Long id;

    /** 标准名称 */
    @Excel(name = "标准名称")
    private String name;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal basicSalary;

    /** 社保扣款 */
    @Excel(name = "社保扣款")
    private BigDecimal socialSecurity;

    /** 津贴 */
    @Excel(name = "津贴")
    private BigDecimal allowance;

    /** 奖金 */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setBasicSalary(BigDecimal basicSalary) 
    {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getBasicSalary() 
    {
        return basicSalary;
    }
    public void setSocialSecurity(BigDecimal socialSecurity) 
    {
        this.socialSecurity = socialSecurity;
    }

    public BigDecimal getSocialSecurity() 
    {
        return socialSecurity;
    }
    public void setAllowance(BigDecimal allowance) 
    {
        this.allowance = allowance;
    }

    public BigDecimal getAllowance() 
    {
        return allowance;
    }
    public void setBonus(BigDecimal bonus) 
    {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() 
    {
        return bonus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("basicSalary", getBasicSalary())
            .append("socialSecurity", getSocialSecurity())
            .append("allowance", getAllowance())
            .append("bonus", getBonus())
            .toString();
    }
}
