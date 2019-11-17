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
 * @date 2019/11/4 17:05
 */
public class Novel extends Book {
    private String Author;

    public Novel(int pages, double price, String author) {
        super(pages, price);
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return super.getPages()+"页，"+super.getPrice()+"元,作者："+this.Author;
    }
}
