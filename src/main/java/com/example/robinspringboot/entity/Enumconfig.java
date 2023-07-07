package com.example.robinspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName enumconfig
 */
@TableName(value ="enumconfig")
@Data
public class Enumconfig implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String enumtype;

    /**
     * 
     */
    private String enumname;

    /**
     * 
     */
    private Object enumvalue;

    /**
     * 
     */
    private String enumlanguage;

    /**
     * 
     */
    private String notes;

    /**
     * 
     */
    private Date createat;

    /**
     * 
     */
    private String createby;

    /**
     * 
     */
    private Date updateat;

    /**
     * 
     */
    private String updateby;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Enumconfig other = (Enumconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnumtype() == null ? other.getEnumtype() == null : this.getEnumtype().equals(other.getEnumtype()))
            && (this.getEnumname() == null ? other.getEnumname() == null : this.getEnumname().equals(other.getEnumname()))
            && (this.getEnumvalue() == null ? other.getEnumvalue() == null : this.getEnumvalue().equals(other.getEnumvalue()))
            && (this.getEnumlanguage() == null ? other.getEnumlanguage() == null : this.getEnumlanguage().equals(other.getEnumlanguage()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getCreateat() == null ? other.getCreateat() == null : this.getCreateat().equals(other.getCreateat()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getUpdateat() == null ? other.getUpdateat() == null : this.getUpdateat().equals(other.getUpdateat()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnumtype() == null) ? 0 : getEnumtype().hashCode());
        result = prime * result + ((getEnumname() == null) ? 0 : getEnumname().hashCode());
        result = prime * result + ((getEnumvalue() == null) ? 0 : getEnumvalue().hashCode());
        result = prime * result + ((getEnumlanguage() == null) ? 0 : getEnumlanguage().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getCreateat() == null) ? 0 : getCreateat().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getUpdateat() == null) ? 0 : getUpdateat().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enumtype=").append(enumtype);
        sb.append(", enumname=").append(enumname);
        sb.append(", enumvalue=").append(enumvalue);
        sb.append(", enumlanguage=").append(enumlanguage);
        sb.append(", notes=").append(notes);
        sb.append(", createat=").append(createat);
        sb.append(", createby=").append(createby);
        sb.append(", updateat=").append(updateat);
        sb.append(", updateby=").append(updateby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}