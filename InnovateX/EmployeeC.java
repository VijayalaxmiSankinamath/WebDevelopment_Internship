class EmployeeC{
    int id;
    double sal;
    char grade;
    EmployeeC(int a,double b,char c){
      id=a;
      sal=b;
      grade=c;
      }
      public static void main(String[] args){
        EmployeeC e1=new EmployeeC(102,67890.90,'A');
	System.out.println(e1.id);
	System.out.println(e1.sal);
	System.out.println(e1.grade);
	}
}