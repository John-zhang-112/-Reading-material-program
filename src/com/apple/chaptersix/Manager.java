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
 * @date 2019/10/31 0:22
 */
public class Manager {
    public static void main(String[] args){
        BookServiceImpl bookService =new BookServiceImpl();
        bookService.makebooks();
        bookService.showbooks();

    }
}
