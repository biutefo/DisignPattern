package pers.xin.proxy;

import pers.xin.proxy.Printable;

public class Printer implements Printable {
	@Override
	public void print() {
		System.out.println("Hello, world!");
	}
}
