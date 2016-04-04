import java.util.ArrayList;

public class Store {

	private static ArrayList<Bike> List = new ArrayList<Bike>();
	
    public static String getAllBikes() {
        /** Skaper en string som sedan loopar igenom arraylistan*/
    	String returnString = "";
        int counter = 1;
            for (Bike s : List) {
                returnString = returnString + "Cykel " + counter + ": " + s.getColor() + ", " + s.getSize() + ", " + s.getPrice() + "\n";
                counter++; 
           }
            return returnString;
    }
			
    public static void addBike(String color, int size, int price){
    	/** Lägger till en ny cykel till arraylistan*/
    	List.add(new Bike(color, size, price));
	}
    
}