
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
		String s = "Ormen som heter Emil tillh�r kategorin  '" + latinName + " ormar och �r ";
		if (this.isPoisonus()) {
			s+="giftig";
		} else {
			s+="inte s� giftig";
		}
		return s;
	}
}