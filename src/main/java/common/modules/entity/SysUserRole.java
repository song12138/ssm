package common.modules.entity;

public class SysUserRole {
  private String id;
  private String user_id;
  private String role_id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getRole_id() {
    return role_id;
  }

  public void setRole_id(String role_id) {
    this.role_id = role_id;
  }

  /**
   * 返回JSON格式的String字符串方法
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("\"id\":\"")
            .append(id).append('\"');
    sb.append(",\"user_id\":\"")
            .append(user_id).append('\"');
    sb.append(",\"role_id\":\"")
            .append(role_id).append('\"');
    sb.append('}');
    return sb.toString();
  }
}
