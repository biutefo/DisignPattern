package pers.xin.simpleFactory.impl;

import lombok.Data;

/**
 * 乘法操作工具类
 *
 * @author xin
 * @create 2019-03-06 1:24 PM
 **/
@Data
public class MulOperation extends AbstractOperation {

    @Override
    public double getResult() {
        return number1*number2;
    }
}
