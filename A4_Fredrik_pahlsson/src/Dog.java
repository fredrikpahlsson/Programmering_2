public class Dog {
	private String name;
	
	//Konstruktor
	/**Skapar en Dog genom instansvariablen name*/ 
	public Dog (String name){
		this.name = name;
	}
	
	//Metod
	/** Tar name f�r dog */
	public String getDogName(){
		return this.name;
	}
	
}