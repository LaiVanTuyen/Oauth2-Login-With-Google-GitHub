package com.ptit.oauth2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="role")
@Data
public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id" , nullable = false)
        private int id;
        @Basic
        @Column(name = "role",nullable = false, length = 45 )
        private String role;

        @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
        private Set<User> users = new HashSet<User>();


}
