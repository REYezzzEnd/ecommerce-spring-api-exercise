package com.gabriel.ecommerce_api.exceptions;

public class ClienteNotFoundException extends RuntimeException{
    public ClienteNotFoundException(String message){
        super(message);
    }

}
