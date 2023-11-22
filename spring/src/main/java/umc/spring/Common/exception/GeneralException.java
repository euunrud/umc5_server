package umc.spring.Common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.spring.Common.code.BaseErrorCode;
import umc.spring.Common.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}