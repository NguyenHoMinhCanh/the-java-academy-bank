package com.musdon.thejavaacademybank.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;

}
