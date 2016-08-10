public abstract class Animal {
	
	protected String latinName;
    protected String Name;

  //konstruktor
  	/**Skapar en Animal med en String-variabel latinName*/
	public Animal(String latinName) {
		this.latinName = latinName;
		
	}


	//Metod
	/**Abstract metod som alla sub-classer tar efter*/
	public abstract String getInfo();


	/**Tar friendlyName av Animal*/
	public void setFriendlyName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return this.Name;
	}
}