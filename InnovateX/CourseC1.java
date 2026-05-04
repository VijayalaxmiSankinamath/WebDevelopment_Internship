class CourseC1{
    double cost;
    String name;
    String u_name;
    CourseC1(double cost,String name,String u_name){
      this.cost=cost;
      this.name=name;
      this.u_name=u_name;
      }
      public static void main(String[] args){
        CourseC1 c1=new CourseC1(19320.50,"java","Jspiders");
	System.out.println(c1.cost);
	System.out.println(c1.name);
	System.out.println(c1.u_name);
	}
}