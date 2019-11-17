/*
 * Copyright 2019 tu.cn All right reserved. This software is the
 * confitdental and proprietary information of tu.cn("Confidenal
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */

package com.apple.chaptersix;

import java.util.Scanner;

/**
 * @author John-zhang
 * @program homework
 * @Description
 * @date 2019/11/2 17:47
 */
public class BookServiceImpl implements BookService {

    @Override
    public void makebooks(){

        Book Magazine = new Magazine(153,50.2,"2015");
        System.out.println(Magazine.toString());
        Book Novel = new Novel(453,63,"毛泽东");
        System.out.println(Novel.toString());
        Book Textbook = new Textbook(120,5.68,"Students");
        System.out.println(Textbook.toString());
    }

    @Override
    public void showbooks(){
        System.out.println("This is a magazine.");

        System.out.println("This is a novel");
        System.out.println("This is textbook");
    }


}

