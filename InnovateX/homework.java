class homework
{
	static double area(int r){
		final float pi=3.14f;
		double area=pi*(r*r);
		return area;
	}
	static int area1(int a){
		int b= a*a;
		return b;
	}
	static double zoid(int a,int b,int h){
		double trape = (0.5*(a+b))+h;
		return trape;
	}
	static int areaRect(int w ,int h){
		int u=w*h;
		return u;
	}
	static double area(int r,int theta){
		double area=(0.5)*(r*r)*theta;
		return area;
	}
	static double sect(int a,int b){
		final float pi=3.14f;
		double area=pi*(a*b);
		return area;
	}
	static int areaParl(int w ,int h){
		int u=w*h;
		return u;
	}
	static double tri(int b,int h)
	{
		
		double t=(0.5)*b*h;
		return t;
	}
	public static void main(String[] args){
		
    System.out.println(area(2));
	System.out.println(area1(2));
	System.out.println(zoid(2,3,4));
	System.out.println(areaRect(2,7));
	System.out.println(area(2,60));
	System.out.println(sect(2,4));
	System.out.println(areaParl(2,9));
	System.out.println(tri(6,8));
	
	}
	
	
}