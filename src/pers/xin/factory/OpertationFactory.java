package pers.xin.factory;

import pers.xin.factory.impl.AddOperation;
import pers.xin.factory.impl.DivOperation;
import pers.xin.factory.impl.MulOperation;
import pers.xin.factory.impl.SubOperation;
import pers.xin.factory.inter.IOperation;

/**
 * 创建运算工具类的工厂
 *
 * @author xin
 * @create 2019-03-06 1:35 PM
 **/
public class OpertationFactory {

    public static IOperation createOperation(String operator) {
        IOperation operation = null;
        switch (operator) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                break;
        }
        return operation;
    }
}
