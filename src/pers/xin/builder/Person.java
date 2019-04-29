package pers.xin.builder;

public class Person {

	private String name;
	private String sex;
	private Integer age;
	private Dog dog;

	public Person(String name, String sex, Integer age, Dog dog) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.dog = dog;
	}

	public Person(Builder builder) {
		this(builder.name,builder.sex,builder.age,builder.dog);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", dog=" + dog +
				'}';
	}

	public static class Builder {
		private String name;
		private String sex;
		private Integer age = 0;
		private Dog dog = new Dog();

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder age(Integer age) {
			this.age = age;
			return this;
		}

		public Builder dog(Dog dog) {
			this.dog = dog;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}


}

class Dog {
	private String name;
	private Integer age;

	public Dog() {
	}

	public Dog(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}