public class Human {
	
	private Dog dog = null;
	private String name;

	//Konstruktor
	/** Ger m�nniskan ett namn i form av en string */
	public Human(String name) {
		this.name = name;
	}
	
	//Metod
	/**  H�mtar och retunerar namnet p� m�nniskan*/ 
	public String getName() {
		return this.name;
	}
	/**En metod f�r att k�pa hunden och koppla denna till en m�nniska*/
	public void buyDog(Dog dog) {
		this.dog = dog;
	}
	/**En metod f�r att h�mta namnet p� m�nniskan och hunden och h�mtars i GUI*/
	public String getInfo() {
		if (dog != null) {
			return name + " �ger en vovve som heter " + dog.getDogName();
		} else {
			return name + " �ger inte en vovve";
		}
	}
	

}
