class Trypr{
	int x;
	int y;
	int z;
	Trypr(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=x*y;
	}
	public static void main(String[] args){
		Trypr t1 = new Trypr(12,34,0);
		System.out.println(t1.x);
		System.out.println(t1.y);
		System.out.println(t1.z);
	}
}