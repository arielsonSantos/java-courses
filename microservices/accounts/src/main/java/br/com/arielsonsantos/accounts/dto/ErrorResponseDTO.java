package br.com.arielsonsantos.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponseDTO extends ResponseBaseDTO {

    public ErrorResponseDTO(HttpStatus statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    private String apiPath;

    private LocalDateTime errorTime;

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(LocalDateTime errorTime) {
        this.errorTime = errorTime;
    }
}
