package umc.spring.Common.code;

import java.security.cert.CertPathValidatorException;

public interface BaseCode {

    public CertPathValidatorException.Reason getReason();

    public CertPathValidatorException.Reason getReasonHttpStatus();
}