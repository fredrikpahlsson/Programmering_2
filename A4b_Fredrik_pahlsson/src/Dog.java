/**classen Dog �rver fr�n Mammalclassen*/
public class Dog extends Mammal {
	private boolean aggressive;

	//Konstruktor
  /**skapar en Dog med Stringvariablen latinName, int GTime och boolean aggressive*/
	public Dog(String latinName, int GTime, boolean aggressive) {
		super(latinName, GTime);
		this.aggressive = aggressive;
		
	}
 /**skapar en Dog med Stringvariablen latinName, int GTime och boolean aggresive och String Name*/
	public Dog(String latinName, int GTime, boolean aggressive, String Name) {
		super(latinName, GTime);
		this.aggressive = aggressive;
		this.Name = Name;
	}
	
	//Metod
	/**kollar om hunden �r aggresive*/
	public boolean isaggressive() {
		if (aggressive) {
			return true;
		} else {
			return false;
		}
	}
	/**�rver och implementerar metoden getInfo fr�n Animalklassen*/
	public String getInfo() {
		String s = "Hunden som heter " + super.getName() + " och tillh�r rasen " + latinName + " �r dr�ktig i " + super.getGTime() + " m�nader och �r en ";
		if (this.isaggressive()) {
			s+="aggressiv vovve!";
		} else {
			s+="snell vovve!";
		}
		return s;
	}
	
}