package com.semicolon.africa.shitaLogistics.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Sender {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
}
