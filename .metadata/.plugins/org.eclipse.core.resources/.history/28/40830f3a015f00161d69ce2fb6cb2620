/**Ärver från animalklassen*/
public class Snake extends Animal {
	
	private boolean poisonus;

	//Constructor
		/**skapar en Snake genom String-variablen latinName och boolean-variablen poisonus*/
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
	}
//Metod 
	/**Kollar om snake är giftig, och retunerar isf true eller false*/
	public boolean isPoisonus() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	}
	/**Ärver och implementerar den abstrakta metoden getInfo från Animalklassen*/
	public String getInfo() {
		String s = "Ormen som heter Emil tillhör kategorin  '" + latinName + " ormar och är ";
		if (this.isPoisonus()) {
			s+="giftig";
		} else {
			s+="inte så giftig";
		}
		return s;
	}
}