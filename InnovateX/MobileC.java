class MobileC{
    double cost;
    String model;
    String color;
    MobileC(double a, String b,String c){
      cost=a;
      model=b;
      color=c;
      }
      public static void main(String[] args){
        MobileC m1=new MobileC(18590.70,"Samsung","blue");
	System.out.println(m1.cost);
	System.out.println(m1.model);
	System.out.println(m1.color);
	}
}