package br.com.arielsonsantos.accounts.dto;

import org.springframework.http.HttpStatus;

public class ResponseDTO extends ResponseBaseDTO {

    public ResponseDTO(HttpStatus statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
}
