package com.uid2.enclave;

public class AttestationException extends Exception {

    public AttestationException(Throwable t) {
        super(t);
    }

    public AttestationException(String message) {
        super(message);
    }
    
}
