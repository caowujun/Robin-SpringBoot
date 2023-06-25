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
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String userdisplayname;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Object roletype;

    /**
     * 
     */
    private String citycode;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String phone;

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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserdisplayname() == null ? other.getUserdisplayname() == null : this.getUserdisplayname().equals(other.getUserdisplayname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRoletype() == null ? other.getRoletype() == null : this.getRoletype().equals(other.getRoletype()))
            && (this.getCitycode() == null ? other.getCitycode() == null : this.getCitycode().equals(other.getCitycode()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
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
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserdisplayname() == null) ? 0 : getUserdisplayname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRoletype() == null) ? 0 : getRoletype().hashCode());
        result = prime * result + ((getCitycode() == null) ? 0 : getCitycode().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
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
        sb.append(", username=").append(username);
        sb.append(", userdisplayname=").append(userdisplayname);
        sb.append(", password=").append(password);
        sb.append(", roletype=").append(roletype);
        sb.append(", citycode=").append(citycode);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
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