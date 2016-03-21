public class Human {
	private Dog dog;
	private String name = "";

	/** Constructor for human */
	public Human(String name) {
		this.name = name;
	}

	/** Returns the name of the human */
	public String getName() {
		return this.name;
	}

	/** Connects the human with the dog created through GUI */
	public Dog buyDog(Dog dog1) {
		dog = new Dog("");
		this.dog = dog1;
		return this.dog;
	}

	/** Returns either a string telling you that the human either owns or does not own a dog. */
	public String getInfo() {
		String info = "";

		if (dog == null) {
			info = getName() + " �ger inte en hund";
		} else {
			info = getName() + " �ger en huns som heter " + dog.getDogName();
		}
		return info;
	}
}

