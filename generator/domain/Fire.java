package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName fire
 */
@TableName(value ="fire")
@Data
public class Fire implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String recorddate;

    /**
     * 
     */
    private String firecount;

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
        Fire other = (Fire) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecorddate() == null ? other.getRecorddate() == null : this.getRecorddate().equals(other.getRecorddate()))
            && (this.getFirecount() == null ? other.getFirecount() == null : this.getFirecount().equals(other.getFirecount()))
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
        result = prime * result + ((getFirecount() == null) ? 0 : getFirecount().hashCode());
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
        sb.append(", firecount=").append(firecount);
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