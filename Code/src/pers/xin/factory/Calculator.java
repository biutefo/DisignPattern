package pers.xin.factory;

import lombok.Data;

/**
 * 简单工厂模式实现计算器
 *
 * @author xin
 * @create 2019-03-06 10:35 AM
 **/
public class Calculator {

    public static void main(String[] args) {
        AbstractOperation abstractOperation = null;
        abstractOperation = (AbstractOperation)OpertationFactory.createOperation("*");
        abstractOperation.setNumber1(1);
        abstractOperation.setNumber2(2);
        double result = abstractOperation.getResult();
        System.out.println(result);
    }
}
