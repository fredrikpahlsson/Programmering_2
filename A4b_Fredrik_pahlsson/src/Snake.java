
public class Snake extends Animal {
	
	private boolean poisonus;


	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
	}

	public boolean isPoisonus() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	}

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