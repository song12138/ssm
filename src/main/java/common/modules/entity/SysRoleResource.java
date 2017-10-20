package common.modules.entity;

public class SysRoleResource {
  private String id;
  private String role_id;
  private String resource_id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRole_id() {
    return role_id;
  }

  public void setRole_id(String role_id) {
    this.role_id = role_id;
  }

  public String getResource_id() {
    return resource_id;
  }

  public void setResource_id(String resource_id) {
    this.resource_id = resource_id;
  }

  /**
   * 返回JSON格式的String字符串方法
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("\"id\":\"")
            .append(id).append('\"');
    sb.append(",\"role_id\":\"")
            .append(role_id).append('\"');
    sb.append(",\"resource_id\":\"")
            .append(resource_id).append('\"');
    sb.append('}');
    return sb.toString();
  }
}
