package cn.genomics.hg.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="User", description="用户类")
public class User {
	
    private Integer userId;
    
    @ApiModelProperty(value="用户名",name="userName",required=true)
    private String userName;

    @ApiModelProperty(value="密码",name="password",required=true)
    private String password;

    @ApiModelProperty(value="手机号",name="phone",required=true)
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}