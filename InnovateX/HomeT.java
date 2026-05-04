class HomeT{
  String name;
  long cost;
  String color;
     HomeT(String name,long cost,String color){
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	public String toString(){
		return this.name + " " + this.cost+" " + this.color;
	}
	public static void main(String[] args){
		 HomeT h1= new  HomeT("xyz",13456L,"blue");
		System.out.println(h1.toString());
	}
}