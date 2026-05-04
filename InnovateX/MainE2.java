class Mobile {
    String name;
    double cost;
    String color;

    // Constructor
    Mobile(String name, double cost, String color) {
        this.name = name;
        this.cost = cost;
        this.color = color;
    }

   public boolean equals(Object obj){
    Mobile m2=(Mobile)obj;
    return this.color==m2.color;
	}
    
}

public class MainE2 {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile("Samsung Galaxy S23", 75000, "Black");
	Mobile m2 = new Mobile("Samsung Galaxy S23", 756789, "Black");
        if(m1.equals(m2)){
	System.out.println("Same");
	}
	else{
	System.out.println("diff");
	} 
    }
}
