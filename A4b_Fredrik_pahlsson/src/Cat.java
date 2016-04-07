public class Cat extends Mammal {

	private int Levels;

	public Cat(String latinName, int GTime, int Levels) {
		super(latinName, GTime);
		this.Levels = Levels;
	}
	

	public String getInfo() {
		return "Kissen som heter Misse och tillh�r rasen " + latinName + " och �r dr�ktig i " + super.getGTime() + " m�nader har ocks�  " + Levels + " liv";
	}

	public int getLevels() {
		return this.Levels;
	}

	public void setLevels(int i) {
		this.Levels = i;
	}	
}