package com.spring.flight.entity.dto;

import com.spring.flight.entity.Role;

import java.util.Collection;

public class OperatorDto {
    private long operatorID;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private Collection<RoleDto> roles;

    public OperatorDto ( long operatorID , String firstName , String lastName , String email , String status , Collection<RoleDto> roles ) {
        this.operatorID = operatorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
        this.roles = roles;
    }

    public long getOperatorID () {
        return operatorID;
    }

    public void setOperatorID ( long operatorID ) {
        this.operatorID = operatorID;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public Collection<RoleDto> getRoles () {
        return roles;
    }

    public void setRoles ( Collection<RoleDto> roles ) {
        this.roles = roles;
    }
}
