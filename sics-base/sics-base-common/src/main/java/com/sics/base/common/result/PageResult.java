package com.sics.base.common.result;

public class PageResult<T> extends Result{
    private PageVO<T> data;

    public static <T> PageResult<T> buildSuccess(PageVO<T> data){
        PageResult<T> result = new PageResult<>();
        result.setSuccess();
        result.setData(data);
        return result;
    }

    public PageVO<T> getData() {
        return data;
    }

    public void setData(PageVO<T> data) {
        this.data = data;
    }
}
