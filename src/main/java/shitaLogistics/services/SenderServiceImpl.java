package com.semicolon.africa.shitaLogistics.services;

import com.semicolon.africa.shitaLogistics.data.repositories.SenderRepository;
import com.semicolon.africa.shitaLogistics.dtos.request.SenderRequest;
import com.semicolon.africa.shitaLogistics.dtos.response.SenderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SenderServiceImpl implements SenderService {

    private final SenderRepository senderRepository;
    @Override
    public SenderResponse sendItem(SenderRequest senderRequest) {

        return null;
    }
}
