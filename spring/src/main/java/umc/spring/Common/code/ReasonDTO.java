package umc.spring.Common.code;

import lombok.Builder;
import lombok.Getter;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.springframework.http.HttpStatus;

import java.security.cert.CertPathValidatorException;


@Getter
@Builder
public class ReasonDTO implements CertPathValidatorException.Reason { // 이유는 반환해주는 DTO 이다

    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String code;
    private final String message;

    public boolean getIsSuccess(){return isSuccess;}
}