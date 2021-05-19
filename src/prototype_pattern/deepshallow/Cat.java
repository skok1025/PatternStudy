package prototype_pattern.deepshallow;

public class Cat implements Cloneable{
	
	private String name;
	private Age age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat) super.clone();
		return ret;
	}

}
