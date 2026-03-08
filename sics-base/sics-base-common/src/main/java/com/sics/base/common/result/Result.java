package com.sics.base.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    public static final String SUCCESS = "success";
    public static final String SUCCESS_CODE = "200";
    public static final String FAIL_CODE = "0";

    private String code;
    private String message;

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

    protected void setSuccess() {
        this.code = SUCCESS_CODE;
        this.message = SUCCESS;
    }

    public static Result buildSuccess(){
        Result result = new Result();
        result.setSuccess();
        return result;
    }

    public static Result buildFail(String errMsg) {
        Result result = new Result();
        result .setCode(FAIL_CODE);
        result.setMessage(errMsg);
        return result;
    }
}
