package common.modules.entity;

import java.util.Date;

public class SysRole {
  private String id;
  private String role;
  private String ename;
  private String description;
  private String organization_id;
  private String resource_ids;
  private String data_range;
  private String available;
  private String create_user;
  private Date create_time;
  private String update_user;
  private Date update_time;
  private String del_flag;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getOrganization_id() {
    return organization_id;
  }

  public void setOrganization_id(String organization_id) {
    this.organization_id = organization_id;
  }

  public String getResource_ids() {
    return resource_ids;
  }

  public void setResource_ids(String resource_ids) {
    this.resource_ids = resource_ids;
  }

  public String getData_range() {
    return data_range;
  }

  public void setData_range(String data_range) {
    this.data_range = data_range;
  }

  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }

  public String getCreate_user() {
    return create_user;
  }

  public void setCreate_user(String create_user) {
    this.create_user = create_user;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public String getUpdate_user() {
    return update_user;
  }

  public void setUpdate_user(String update_user) {
    this.update_user = update_user;
  }

  public Date getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }

  public String getDel_flag() {
    return del_flag;
  }

  public void setDel_flag(String del_flag) {
    this.del_flag = del_flag;
  }

  /**
   * 返回JSON格式的String字符串方法
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("\"id\":\"")
            .append(id).append('\"');
    sb.append(",\"role\":\"")
            .append(role).append('\"');
    sb.append(",\"ename\":\"")
            .append(ename).append('\"');
    sb.append(",\"description\":\"")
            .append(description).append('\"');
    sb.append(",\"organization_id\":\"")
            .append(organization_id).append('\"');
    sb.append(",\"resource_ids\":\"")
            .append(resource_ids).append('\"');
    sb.append(",\"data_range\":\"")
            .append(data_range).append('\"');
    sb.append(",\"available\":\"")
            .append(available).append('\"');
    sb.append(",\"create_user\":\"")
            .append(create_user).append('\"');
    sb.append(",\"create_time\":\"")
            .append(create_time).append('\"');
    sb.append(",\"update_user\":\"")
            .append(update_user).append('\"');
    sb.append(",\"update_time\":\"")
            .append(update_time).append('\"');
    sb.append(",\"del_flag\":\"")
            .append(del_flag).append('\"');
    sb.append('}');
    return sb.toString();
  }
}
