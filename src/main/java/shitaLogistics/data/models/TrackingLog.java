package com.semicolon.africa.shitaLogistics.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Data
public class TrackingLog {
    @Id
    private int id;
    private int trackingNumber;
    private String description;
    private LocalDateTime time;
}
