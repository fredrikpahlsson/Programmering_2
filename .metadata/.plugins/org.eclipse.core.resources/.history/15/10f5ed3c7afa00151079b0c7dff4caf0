import java.util.ArrayList;

public class Store {
	
	public Store(){
		
	}
	


private ArrayList <Bike> allBikes = new ArrayList<Bike>();
//private String myBikes;
//private String name;


public Store(String myBikes){
	this.allBikes = new ArrayList<Bike>();	
}

public void allBikes(Bike c){
	if (allBikes.size()<11){
		this.allBikes.add(c);
	}
}

public void button(){
	allBikes.remove(0);
}

public String getBike(){
	String s = "";
	for (Bike allBikes : allBikes){
		s = s + "The price is " + allBikes.getPrice() + " the size is "+ allBikes.getSize() + " and is " + allBikes.getColor() + "\n";	
	}
	return s;
}
public void addBike (String color, int size, int price){
Bike b = new Bike (color,size,price);
this.allBikes.add(b);
}

}
