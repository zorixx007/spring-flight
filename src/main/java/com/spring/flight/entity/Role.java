package com.spring.flight.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "`role`")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private long roleID;
    @Column(name="role_name")
    private String roleName;
    @ManyToMany(mappedBy = "roles")
//    @JoinTable(name="operator_role", joinColumns=@JoinColumn(name="role_id"), inverseJoinColumns=@JoinColumn(name="operator_id"))
    private Collection<Operator> operators;

    public Role () {
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

    public Collection<Operator> getOperators () {
        return operators;
    }

    public void setOperators ( Collection<Operator> operators ) {
        this.operators = operators;
    }

    @Override
    public String toString () {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                '}';
    }



    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;

        Role role = (Role) o;

        if ( roleID != role.roleID ) return false;
        return roleName.equals ( role.roleName );
    }

    @Override
    public int hashCode () {
        int result = (int) ( roleID ^ ( roleID >>> 32 ) );
        result = 31 * result + roleName.hashCode ( );
        return result;
    }
}
