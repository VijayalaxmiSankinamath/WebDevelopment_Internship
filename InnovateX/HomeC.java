class HomeC{
    String name;
    long cost;
    String color;
    HomeC(String a,long b,String c){
      name=a;
      cost=b;
      color=c;
      }
      public static void main(String[] args){
        HomeC h1=new HomeC("xyz",6789567L,"blue");
	System.out.println(h1.name);
	System.out.println(h1.cost);
	System.out.println(h1.color);
	}
}