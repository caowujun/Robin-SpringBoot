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
 * @TableName log
 */
@TableName(value ="log")
@Data
public class Log implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String userdisplayname;

    /**
     * 
     */
    private String exceptiontype;

    /**
     * 
     */
    private String exceptionmsg;

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
        Log other = (Log) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserdisplayname() == null ? other.getUserdisplayname() == null : this.getUserdisplayname().equals(other.getUserdisplayname()))
            && (this.getExceptiontype() == null ? other.getExceptiontype() == null : this.getExceptiontype().equals(other.getExceptiontype()))
            && (this.getExceptionmsg() == null ? other.getExceptionmsg() == null : this.getExceptionmsg().equals(other.getExceptionmsg()))
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
        result = prime * result + ((getUserdisplayname() == null) ? 0 : getUserdisplayname().hashCode());
        result = prime * result + ((getExceptiontype() == null) ? 0 : getExceptiontype().hashCode());
        result = prime * result + ((getExceptionmsg() == null) ? 0 : getExceptionmsg().hashCode());
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
        sb.append(", userdisplayname=").append(userdisplayname);
        sb.append(", exceptiontype=").append(exceptiontype);
        sb.append(", exceptionmsg=").append(exceptionmsg);
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