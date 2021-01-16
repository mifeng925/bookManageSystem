package com.bee.edu.bean;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 22:28
 */
public class BookSort {
    private String sortId;
    private String sortName;

    public BookSort(String sortId, String sortName) {
        this.sortId = sortId;
        this.sortName = sortName;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
