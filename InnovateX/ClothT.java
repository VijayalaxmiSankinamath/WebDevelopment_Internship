class ClothT{
  String color;
  int cost;
  String size;
    ClothT(String color,int cost,String size){
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	public String toString(){
		return this.color + " " + this.cost +" " + this.size;
	}
	public static void main(String[] args){
		ClothT c1= new ClothT("blue",1234,"XL");
		System.out.println(c1.toString());
	}
}