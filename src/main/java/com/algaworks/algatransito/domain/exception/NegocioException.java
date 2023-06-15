package com.algaworks.algatransito.domain.exception;

public class NegocioException extends RuntimeException{

    public NegocioException(String messahe){
        super(messahe);
    }
}
