package common.modules.entity;

import java.util.Date;

public class SysResource {
  private String id;
  private String name;
  private String type;
  private String url;
  private String parent;
  private String level;
  private String permission;
  private String sort;
  private Long available;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
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
    sb.append(",\"name\":\"")
            .append(name).append('\"');
    sb.append(",\"type\":\"")
            .append(type).append('\"');
    sb.append(",\"url\":\"")
            .append(url).append('\"');
    sb.append(",\"parent\":\"")
            .append(parent).append('\"');
    sb.append(",\"level\":\"")
            .append(level).append('\"');
    sb.append(",\"permission\":\"")
            .append(permission).append('\"');
    sb.append(",\"sort\":\"")
            .append(sort).append('\"');
    sb.append(",\"available\":")
            .append(available);
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
