public class House {
	private int yearBuilt;
	private int size;
	private final int maxSize = 1000;
	private final int minSize = 10;
	private final int maxYearbuilt = 2015;
	private final int minYearbuilt = 1800;

	public House(int yearBuilt, int size) {
		this.yearBuilt = yearBuilt;
		this.size = size;
	
	}

public int getYearBuilt(){
return this.yearBuilt;
}

public int getSize(){
return this.size;
}
}
