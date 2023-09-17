package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.data.models.Address;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RegisterRequest {
    private String email;
    private int age;
    private String nationality;
    private String firstName;
    private String lastName;
    private String password;
    private  String phoneNumber;
    private Address address;
}
