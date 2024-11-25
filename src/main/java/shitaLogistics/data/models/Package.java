package com.semicolon.africa.shitaLogistics.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;


@Data
public class Package {
    @Id
    private String trackingId;
    private String description;
    private String creationDate;
    private int fee;
    private int quantity;
    @DBRef
    private Sender sender;
    @DBRef
    private Receiver receiver;
    @DBRef
    List<TrackingLog>trackingLogs;
}
