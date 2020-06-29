package com.spring.flight.entity.dto;

import javax.persistence.Column;

public class RoleDto {
    private long roleID;
        private String roleName;

    public RoleDto ( long roleID , String roleName ) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public long getRoleID () {
        return roleID;
    }

    public void setRoleID ( long roleID ) {
        this.roleID = roleID;
    }

    public String getRoleName () {
        return roleName;
    }

    public void setRoleName ( String roleName ) {
        this.roleName = roleName;
    }
}
