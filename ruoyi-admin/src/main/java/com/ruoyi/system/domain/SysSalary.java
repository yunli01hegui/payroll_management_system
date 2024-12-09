package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工资查询表对象 sys_salary
 * 
 * @author 龙春杰
 * @date 2023-11-14
 */
public class SysSalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工资ID */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 薪资标准ID */
    @Excel(name = "薪资标准ID")
    private Long salaryStandardId;

    /** 社保扣款 */
    @Excel(name = "社保扣款")
    private BigDecimal socialSecurity;

    /** 津贴 */
    @Excel(name = "津贴")
    private BigDecimal allowance;

    /** 奖金 */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    /** 发放日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发放日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentDate;

    /** 实际工资 */
    @Excel(name = "实际工资")
    private BigDecimal actualSalary;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setSalaryStandardId(Long salaryStandardId) 
    {
        this.salaryStandardId = salaryStandardId;
    }

    public Long getSalaryStandardId() 
    {
        return salaryStandardId;
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
    public void setPaymentDate(Date paymentDate) 
    {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentDate() 
    {
        return paymentDate;
    }
    public void setActualSalary(BigDecimal actualSalary) 
    {
        this.actualSalary = actualSalary;
    }

    public BigDecimal getActualSalary() 
    {
        return actualSalary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("salaryStandardId", getSalaryStandardId())
            .append("socialSecurity", getSocialSecurity())
            .append("allowance", getAllowance())
            .append("bonus", getBonus())
            .append("paymentDate", getPaymentDate())
            .append("actualSalary", getActualSalary())
            .toString();
    }
}
