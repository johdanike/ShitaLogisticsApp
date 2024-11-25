package com.semicolon.africa.shitaLogistics.services;

import com.semicolon.africa.shitaLogistics.dtos.response.SenderResponse;
import com.semicolon.africa.shitaLogistics.dtos.request.SenderRequest;

public interface SenderService {

    SenderResponse sendItem(SenderRequest senderRequest);
}
