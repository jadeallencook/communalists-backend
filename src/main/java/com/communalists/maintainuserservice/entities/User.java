package com.communalists.maintainuserservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "subject_pronoun")
    private String subjectPronoun;

    @Column(name = "object_pronoun")
    private String objectPronoun;

    @Column(name = "is_remote")
    private boolean isRemote;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;
}
