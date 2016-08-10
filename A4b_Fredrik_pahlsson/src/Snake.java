/**�rver fr�n animalklassen*/
public class Snake extends Animal {
	
	private boolean poisonus;

	//Konstruktor
		/**skapar en Snake genom String-variablen latinName och boolean-variablen poisonus*/
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
	}
//Metod 
	/**Kollar om snake �r giftig, och retunerar isf true eller false*/
	public boolean isPoisonus() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	}
	/**�rver och implementerar metoden getInfo fr�n Animalklassen*/
	public String getInfo() {
		String s = "Ormen som heter Emil tillh�r kategorin  '" + latinName + " ormar och �r ";
		if (this.isPoisonus()) {
			s+="giftig";
		} else {
			s+="inte s� giftig";
		}
		return s;
	}
}