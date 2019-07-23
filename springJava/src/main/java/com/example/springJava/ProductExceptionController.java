package com.example.springJava;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice

public class ProductExceptionController {
    @ExceptionHandler(value = ProductNotfoundException.class)
    public ResponseEntity<Object> exception(ProductNotfoundException exception) {
        return new ResponseEntity<>("Car not found", HttpStatus.NOT_FOUND);
        //return new ResponseEntity<>("Product not found", HttpStatus.BAD_REQUEST);
    }
/*/////////////////////////////////////////////*/
@ExceptionHandler(Exception.class)
public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
return new ResponseEntity<>("Car not found", HttpStatus.INTERNAL_SERVER_ERROR);
}



}
