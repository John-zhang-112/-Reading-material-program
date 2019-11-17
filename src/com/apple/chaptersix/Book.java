/*
 * Copyright 2019 tu.cn All right reserved. This software is the
 * confitdental and proprietary information of tu.cn("Confidenal
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */

package com.apple.chaptersix;

/**
 * @author John-zhang
 * @program homework
 * @Description
 * @date 2019/10/31 0:07
 */
public class Book {
    private int pages;
    private double price;

    public Book(int pages, double price) {
        this.pages = pages;
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.pages+","+this.price;
    }
}
