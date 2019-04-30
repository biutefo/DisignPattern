package pers.xin.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

import pers.xin.proxy.Printable;
import pers.xin.proxy.Printer;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer();//目标对象
		getInstance(printer).print();
	}

	public static Printable getInstance(Printer target) {
		return (Printable) Proxy.newProxyInstance(Printer.class.getClassLoader(), Printer.class.getInterfaces(),
				(proxy,method,args)->{
					if ("print".equals(method.getName())) {
						System.out.println("Dear:");
						method.invoke(target, args);
						System.out.println("Yours,xin.");
					} else {
						method.invoke(target, args);//其余方法不被增强
					}
					return null;
				}
		);
	}
}
