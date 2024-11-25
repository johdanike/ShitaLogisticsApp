package com.semicolon.africa.shitaLogistics.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Receiver")
public class Receiver {
    @Id
    private String id;
    private String fullName;
    private String address;
    private String phoneNumber;
}
