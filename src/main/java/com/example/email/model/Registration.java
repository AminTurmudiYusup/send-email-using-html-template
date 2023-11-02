package com.example.email.model;

import lombok.Data;

@Data//i using lombok to create setter and getter
public class Registration {
    private String userName;
    private String email;
    private String password;

}
