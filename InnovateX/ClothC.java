class ClothC{
    String color;
    double cost;
    String size;
    
    ClothC(String a,double b,String c){
     color=a;
     cost=b;
     size=c;
      }
      public static void main(String[] args){
        ClothC c1=new ClothC("blue",1234.90,"XL");
	System.out.println(c1.color);
	System.out.println(c1.cost);
	System.out.println(c1.size);
	}
}