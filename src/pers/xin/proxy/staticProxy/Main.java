package pers.xin.proxy.staticProxy;

import pers.xin.proxy.Printable;
import pers.xin.proxy.Printer;

public class Main {
	public static void main(String[] args) {
		Printable myPrinter = new StaticProxyPrinter(new Printer());
		myPrinter.print();
	}
}
