package com.sics.base.common.ex;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseException extends RuntimeException{
    private String errMsg;

    public BaseException(String errMsg) {
        this.errMsg = errMsg;
    }
}
