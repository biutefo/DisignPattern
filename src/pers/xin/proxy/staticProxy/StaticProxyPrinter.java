package pers.xin.proxy.staticProxy;

import pers.xin.proxy.Printable;
import pers.xin.proxy.Printer;

public class StaticProxyPrinter implements Printable {

	private Printer printer;

	public StaticProxyPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		System.out.println("Dear:");
		printer.print();
		System.out.println("Yours,xin.");
	}
}
