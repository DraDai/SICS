package com.sics.base.common.result;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
public class PageVO<T> implements Serializable {
    private Collection<T> rows;
    private int total;
    private int pageNum;
    private int pageSize;

    public PageVO(Collection<T> rows, int total, int pageNum, int pageSize) {
        this.rows = rows;
        this.total = total;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageVO(int total, Collection<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageVO(Collection<T> rows) {
        this.rows = rows;
    }
}
