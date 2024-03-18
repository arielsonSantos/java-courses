package br.com.arielsonsantos.accounts.dto;

import org.springframework.http.HttpStatus;

public class ResponseBaseDTO {

    private HttpStatus statusCode;

    private String statusMessage;

    public ResponseBaseDTO(HttpStatus statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
