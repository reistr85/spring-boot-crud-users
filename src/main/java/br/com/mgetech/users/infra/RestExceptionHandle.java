package br.com.mgetech.users.infra;

import br.com.mgetech.users.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandle extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<ExceptionBody> notFoundHandle(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ExceptionBody(HttpStatus.NOT_FOUND.value(), exception.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    private ResponseEntity<ExceptionBody> runTimeHandle(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ExceptionBody(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage()));
    }
}
