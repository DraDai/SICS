package com.sics.base.common.utils;

import com.sics.base.common.ex.BaseException;
import com.sics.base.common.result.PageResult;
import com.sics.base.common.result.Result;
import com.sics.base.common.result.SimpleResult;

public class FeignResultUtil {
    public static <T> T extractData(Result data) {
        if (!data.isSuccess()) {
            throw new BaseException(data.getMessage());
        }
        T t = null;
        if (data instanceof SimpleResult<?> simpleResult) {
            t = (T) simpleResult.getData();
        } else if (data instanceof PageResult<?> pageResult) {
            t =  (T) pageResult.getData();
        }
        return t;
    }
}
