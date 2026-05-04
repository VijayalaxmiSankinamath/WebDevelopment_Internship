class HomeC1{
    String name;
    long cost;
    String color;
    HomeC1(String name,long cost,String color){
      this.name=name;
      this.cost=cost;
      this.color=color;
      }
      public static void main(String[] args){
        HomeC1 h1=new HomeC1("xyz",6789567L,"blue");
	System.out.println(h1.name);
	System.out.println(h1.cost);
	System.out.println(h1.color);
	}
}