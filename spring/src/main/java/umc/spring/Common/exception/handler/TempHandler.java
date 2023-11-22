package umc.spring.Common.exception.handler;

import umc.spring.Common.code.BaseErrorCode;
import umc.spring.Common.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
