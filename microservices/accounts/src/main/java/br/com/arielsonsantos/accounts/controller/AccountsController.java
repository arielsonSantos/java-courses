package br.com.arielsonsantos.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.accounts.dto.CustomerDTO;
import br.com.arielsonsantos.accounts.dto.ResponseDTO;

@RestController
@RequestMapping("/api/accounts")
public class AccountsController {

    private static final String MESSAGE_201 = "Account created successfully";

    @PostMapping()
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(HttpStatus.CREATED, MESSAGE_201));
    }

}
