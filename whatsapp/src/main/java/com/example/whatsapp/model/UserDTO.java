package com.example.whatsapp.model;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class UserDTO {

    @NonNull
    private String name;

    @NonNull
    private String phone;
}
