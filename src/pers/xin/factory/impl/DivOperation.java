package pers.xin.factory.impl;

import lombok.Data;
import pers.xin.factory.impl.AbstractOperation;

/**
 * 减法操作工具类
 *
 * @author xin
 * @create 2019-03-06 1:24 PM
 **/
@Data
public class DivOperation extends AbstractOperation {


    @Override
    public double getResult() {
        if(number2==0){
            throw new ArithmeticException("除数为零");
        }
        return number1/number2;
    }
}
