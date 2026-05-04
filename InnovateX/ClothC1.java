class ClothC1{
    String color;
    double cost;
    String size;
    
    ClothC1(String color,double cost,String size){
     this.color=color;
     this.cost=cost;
     this.size=size;
      }
      public static void main(String[] args){
        ClothC1 c1=new ClothC1("blue",1234.90,"XL");
	System.out.println(c1.color);
	System.out.println(c1.cost);
	System.out.println(c1.size);
	}
}