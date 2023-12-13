package com.example.bomoc.Model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "name")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Name implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;

    @OneToOne(mappedBy = "name")
    private User user;
}
