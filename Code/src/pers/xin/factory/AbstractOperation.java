package pers.xin.factory;

import lombok.Data;

/**
 * 抽象计算工具类
 *
 * @author xin
 * @create 2019-03-06 1:21 PM
 **/
@Data
public abstract class AbstractOperation implements IOperation{
    protected double number1;
    protected double number2;

    public AbstractOperation() {
    }

    public AbstractOperation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public abstract double getResult();
}
