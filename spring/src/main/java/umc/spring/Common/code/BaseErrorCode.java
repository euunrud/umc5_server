package umc.spring.Common.code;

public interface BaseErrorCode { // 에러 코드이다

    public ErrorReasonDTO getReason();

    public ErrorReasonDTO getReasonHttpStatus();
}