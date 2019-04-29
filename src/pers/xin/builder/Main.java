package pers.xin.builder;

public class Main {
	public static void main(String[] args) {
		Person person = new Person.Builder().age(20).name("李鑫").dog(new Dog("旺财",2)).build();
		System.out.println(person);
	}
}
