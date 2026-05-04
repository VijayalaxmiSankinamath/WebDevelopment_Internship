class CarC{
    double cost;
    String model;
    String type;
    CarC(double a, String b,String c){
      cost=a;
      model=b;
      type=c;
      }
      public static void main(String[] args){
        CarC c1=new CarC(900000.00,"Tata","petorl");
	System.out.println(c1.cost);
	System.out.println(c1.model);
	System.out.println(c1.type);
	}
}