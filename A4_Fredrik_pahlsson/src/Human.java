public class Human {
	private Dog dog;
	private String name = "";

	
	public Human(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}


	public Dog buyDog(Dog dog1) {
		dog = new Dog("");
		this.dog = dog1;
		return this.dog;
	}

	public String getInfo() {
		String info = "";

		if (dog == null) {
			info = getName() + " Dont own a dog";
		} else {
			info = getName() + " Owns a dog named" + dog.getDogName();
		}
		return info;
	}
}

