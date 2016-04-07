public abstract class Mammal extends Animal {
	private int GTime;

	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.GTime = GTime;
	}

	public int getGTime() {
		return this.GTime;
	}

}