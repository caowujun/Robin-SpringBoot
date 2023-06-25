package com.example.robinspringboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName gasoline
 */
@TableName(value ="gasoline")
@Data
public class Gasoline implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private Date recorddate;

    /**
     * 
     */
    private Integer amount;

    /**
     * 
     */
    private Integer litre;

    /**
     * 
     */
    private Integer unitprice;

    /**
     * 
     */
    private Object isfillup;

    /**
     * 
     */
    private Object kilometers;

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
        Gasoline other = (Gasoline) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecorddate() == null ? other.getRecorddate() == null : this.getRecorddate().equals(other.getRecorddate()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getLitre() == null ? other.getLitre() == null : this.getLitre().equals(other.getLitre()))
            && (this.getUnitprice() == null ? other.getUnitprice() == null : this.getUnitprice().equals(other.getUnitprice()))
            && (this.getIsfillup() == null ? other.getIsfillup() == null : this.getIsfillup().equals(other.getIsfillup()))
            && (this.getKilometers() == null ? other.getKilometers() == null : this.getKilometers().equals(other.getKilometers()))
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
        result = prime * result + ((getRecorddate() == null) ? 0 : getRecorddate().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getLitre() == null) ? 0 : getLitre().hashCode());
        result = prime * result + ((getUnitprice() == null) ? 0 : getUnitprice().hashCode());
        result = prime * result + ((getIsfillup() == null) ? 0 : getIsfillup().hashCode());
        result = prime * result + ((getKilometers() == null) ? 0 : getKilometers().hashCode());
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
        sb.append(", recorddate=").append(recorddate);
        sb.append(", amount=").append(amount);
        sb.append(", litre=").append(litre);
        sb.append(", unitprice=").append(unitprice);
        sb.append(", isfillup=").append(isfillup);
        sb.append(", kilometers=").append(kilometers);
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