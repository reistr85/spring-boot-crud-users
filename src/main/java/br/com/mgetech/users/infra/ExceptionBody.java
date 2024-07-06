package br.com.mgetech.users.infra;

import org.springframework.http.HttpStatus;

public record ExceptionBody(Integer statusCode, String message) {
}
