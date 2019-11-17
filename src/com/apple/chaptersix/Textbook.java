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
 * @date 2019/11/4 17:12
 */
public class Textbook extends Book {
    private String User;

    public Textbook(int pages, double price, String user) {
        super(pages, price);
        User = user;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public String toString() {
        return super.getPages()+"页,"+super.getPrice()+"元，使用对象："+this.User;
    }
}
