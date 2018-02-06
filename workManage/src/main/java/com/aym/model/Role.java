package com.aym.model;

public class Role {
    private String id;

    private String description;

    private String roleCreate;

    private String roleName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRoleCreate() {
        return roleCreate;
    }

    public void setRoleCreate(String roleCreate) {
        this.roleCreate = roleCreate == null ? null : roleCreate.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}