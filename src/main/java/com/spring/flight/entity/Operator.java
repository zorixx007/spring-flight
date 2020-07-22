package com.spring.flight.entity;


import com.spring.flight.entity.dto.RoleDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "`operator`")
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id")
    private long operatorID;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String status;
    @ManyToMany
    @JoinTable(name = "operator_role", joinColumns = @JoinColumn(name = "operator_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

    public Operator () {
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public long getOperatorID () {
        return operatorID;
    }

    public void setOperatorID ( long operatorID ) {
        this.operatorID = operatorID;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
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

    public Collection<Role> getRoles () {
        return roles;
    }

    public void setRoles ( Collection<Role> roles ) {
        this.roles = roles;
    }


    @Override
    public String toString () {
        return "Operator{" +
                "operatorID=" + operatorID +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", roles=" + Arrays.toString ( roles.toArray ( ) ) +
                '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;

        Operator operator = (Operator) o;

        if ( operatorID != operator.operatorID ) return false;
        if ( !password.equals ( operator.password ) ) return false;
        if ( !firstName.equals ( operator.firstName ) ) return false;
        if ( !lastName.equals ( operator.lastName ) ) return false;
        if ( !email.equals ( operator.email ) ) return false;
        return status.equals ( operator.status );
    }

    @Override
    public int hashCode () {
        int result = (int) ( operatorID ^ ( operatorID >>> 32 ) );
        result = 31 * result + password.hashCode ( );
        result = 31 * result + firstName.hashCode ( );
        result = 31 * result + lastName.hashCode ( );
        result = 31 * result + email.hashCode ( );
        result = 31 * result + status.hashCode ( );
        return result;
    }
}
