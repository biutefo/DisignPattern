package pers.xin.prototype;

public class Main {
	public static void main(String[] args) {
		//准备
		Manager manager = new Manager();
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox messageBox1 = new MessageBox('*');
		MessageBox messageBox2 = new MessageBox('/');
		manager.register("strong message", underlinePen);
		manager.register("warning message", messageBox1);
		manager.register("strong message", messageBox2);

		//生成
		Product product1 = manager.create("strong message");
		product1.use("Hello, world!");
		Product product2 = manager.create("warning message");
		product2.use("Hello, world!");
		Product product3 = manager.create("strong message");
		product3.use("Hello, world!");

	}
}
