package pers.xin.simpleFactory;

import pers.xin.simpleFactory.impl.AddOperation;
import pers.xin.simpleFactory.impl.DivOperation;
import pers.xin.simpleFactory.impl.MulOperation;
import pers.xin.simpleFactory.impl.SubOperation;
import pers.xin.simpleFactory.inter.IOperation;

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
