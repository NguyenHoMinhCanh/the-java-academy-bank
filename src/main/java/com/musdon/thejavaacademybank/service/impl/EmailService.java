package com.musdon.thejavaacademybank.service.impl;

import com.musdon.thejavaacademybank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlter(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);

}
