/**Mammalklassen ärver från Animalklassen*/
public abstract class Mammal extends Animal {
	private int GTime;

	//Konstruktor
    /**skapar en Mammal med en String-variabel latinName, int-variablel och GTime*/
	public Mammal(String latinName, int GTime) {
		super(latinName);
		this.GTime = GTime;
	}

	//Metod
	/**Sätter GTime av Mammal*/
	public int getGTime() {
		return this.GTime;
	}

}