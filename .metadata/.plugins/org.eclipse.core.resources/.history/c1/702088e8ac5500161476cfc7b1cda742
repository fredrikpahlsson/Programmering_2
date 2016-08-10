public class Dog extends Mammal {
	private boolean aggressive;

	public Dog(String latinName, int GTime, boolean aggressive) {
		super(latinName, GTime);
		this.aggressive = aggressive;
		
	}

	public Dog(String latinName, int GTime, boolean aggressive, String Name) {
		super(latinName, GTime);
		this.aggressive = aggressive;
		this.Name = Name;
	}
	public boolean isaggressive() {
		if (aggressive) {
			return true;
		} else {
			return false;
		}
	}

	public String getInfo() {
		String s = "Hunden som heter " + super.getName() + " och tillhör rasen " + latinName + " är dräktig i " + super.getGTime() + " månader och är en ";
		if (this.isaggressive()) {
			s+="aggressiv vovve!";
		} else {
			s+="snell vovve!";
		}
		return s;
	}
	
}