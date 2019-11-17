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
 * @date 2019/10/31 0:11
 */
public class Magazine extends Book{
    public String getDataofpublish() {
        return dataofpublish;
    }

    public Magazine(int pages, double price, String dataofpublish) {
        super(pages, price);
        this.dataofpublish = dataofpublish;
    }

    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }

    private String dataofpublish;

    @Override
    public String toString() {
        return super.getPages()+"页,"+super.getPrice()+"元,出版时间："+this.dataofpublish;
    }
}
