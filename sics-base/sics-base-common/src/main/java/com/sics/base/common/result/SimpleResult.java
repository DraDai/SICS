package com.sics.base.common.result;

import lombok.Data;

@Data
public class SimpleResult<T> extends Result{
    protected T data;

    public static <T> SimpleResult<T> buildSuccess(T data){
        SimpleResult<T> result = new SimpleResult<>();
        result.setSuccess();
        result.setData(data);
        return result;
    }

    public static SimpleResult buildSuccess(){
        return buildSuccess((Object) null);
    }

}
