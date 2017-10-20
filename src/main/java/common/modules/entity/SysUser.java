package common.modules.entity;

import java.util.Date;

public class SysUser {
  private String id;
  private String organization_id;
  private String username;
  private String realname;
  private String password;
  private String salt;
  private String role_ids;
  private String employee_no;
  private String phone;
  private String email;
  private String remark;
  private Long locked;
  private Date create_time;
  private String create_user;
  private Date update_time;
  private String update_user;
  private String delete_flag;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrganization_id() {
    return organization_id;
  }

  public void setOrganization_id(String organization_id) {
    this.organization_id = organization_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getRole_ids() {
    return role_ids;
  }

  public void setRole_ids(String role_ids) {
    this.role_ids = role_ids;
  }

  public String getEmployee_no() {
    return employee_no;
  }

  public void setEmployee_no(String employee_no) {
    this.employee_no = employee_no;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Long getLocked() {
    return locked;
  }

  public void setLocked(Long locked) {
    this.locked = locked;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public String getCreate_user() {
    return create_user;
  }

  public void setCreate_user(String create_user) {
    this.create_user = create_user;
  }

  public Date getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }

  public String getUpdate_user() {
    return update_user;
  }

  public void setUpdate_user(String update_user) {
    this.update_user = update_user;
  }

  public String getDelete_flag() {
    return delete_flag;
  }

  public void setDelete_flag(String delete_flag) {
    this.delete_flag = delete_flag;
  }

  /**
   * 返回JSON格式的String字符串方法
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("\"id\":\"")
            .append(id).append('\"');
    sb.append(",\"organization_id\":\"")
            .append(organization_id).append('\"');
    sb.append(",\"username\":\"")
            .append(username).append('\"');
    sb.append(",\"realname\":\"")
            .append(realname).append('\"');
    sb.append(",\"password\":\"")
            .append(password).append('\"');
    sb.append(",\"salt\":\"")
            .append(salt).append('\"');
    sb.append(",\"role_ids\":\"")
            .append(role_ids).append('\"');
    sb.append(",\"employee_no\":\"")
            .append(employee_no).append('\"');
    sb.append(",\"phone\":\"")
            .append(phone).append('\"');
    sb.append(",\"email\":\"")
            .append(email).append('\"');
    sb.append(",\"remark\":\"")
            .append(remark).append('\"');
    sb.append(",\"locked\":")
            .append(locked);
    sb.append(",\"create_time\":\"")
            .append(create_time).append('\"');
    sb.append(",\"create_user\":\"")
            .append(create_user).append('\"');
    sb.append(",\"update_time\":\"")
            .append(update_time).append('\"');
    sb.append(",\"update_user\":\"")
            .append(update_user).append('\"');
    sb.append(",\"delete_flag\":\"")
            .append(delete_flag).append('\"');
    sb.append('}');
    return sb.toString();
  }
}
