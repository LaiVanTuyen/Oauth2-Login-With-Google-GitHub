package com.ptit.oauth2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private int id;

    @Basic
    @Column(name = "name",nullable = false, length = 45 )
    private String name;
    @Basic
    @Column(name = "email",nullable = false, length = 100 )
    private String email;
    @Basic
    @Column(name = "password",nullable = false, length = 255 )
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
    Set<Role> roles = new HashSet<Role>();

    public Set<Role> getRole() {
        return roles;
    }

    public void setRole(Role role) {
        this.roles.add(role);
    }
}
