package com.uid2.enclave;

public interface IAttestationProvider {
    byte[] getAttestationRequest(byte[] publicKey) throws AttestationException;
}
