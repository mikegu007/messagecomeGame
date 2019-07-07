package com.message.game.model.exception;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class XyxException extends RuntimeException{

    private String errCode;

    private String errMsg;

    private static String ERR_PREFIX = "MAXUS_AUTH_";

    public XyxException(String errCode, String errMsg){
        this.errCode = ERR_PREFIX + errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String getMessage() {
        return this.errMsg;
    }
}
