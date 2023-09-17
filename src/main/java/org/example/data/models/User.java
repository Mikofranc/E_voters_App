package org.example.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private int age;
    private String nationality;
    private String firstName;
    private String lastName;
    private String dateCreated;
    private String password;
    private  String phoneNumber;
    @OneToOne
    private Address address;
    @OneToOne
    private Presidency presidency;
    @OneToOne
    private HouseOfRep houseOfRep;
    @OneToOne
    private Governorship governorship;
    private boolean emailVerification;
}
