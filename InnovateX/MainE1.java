class Bike {
    String color;
    double cost;
    String brand;

    Bike(String color, double cost, String brand) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
    }

    public boolean equals(Object obj){
    Bike b2 = (Bike)obj;
    return this.color==b2.color;
	}
    
}

public class MainE1 {
    public static void main(String[] args) {

        Bike b1 = new Bike("Red", 95000, "Yamaha");
	Bike b2 = new Bike("Red", 951230, "YamahaBike");
	if(b1.equals(b2)){
	System.out.println("Same ");
	}else{
	System.out.println("Diff");
	}  
    }
}