class CourseC{
    double cost;
    String name;
    String u_name;
    CourseC(double a,String b,String c){
      cost=a;
      name=b;
      u_name=c;
      }
      public static void main(String[] args){
        CourseC c1=new CourseC(19320.50,"java","Jspiders");
	System.out.println(c1.cost);
	System.out.println(c1.name);
	System.out.println(c1.u_name);
	}
}