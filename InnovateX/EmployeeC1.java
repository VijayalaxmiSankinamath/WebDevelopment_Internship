class EmployeeC1{
    int id;
    double sal;
    char grade;
    EmployeeC1(int id,double sal,char grade){
      this.id=id;
      this.sal=sal;
      this.grade=grade;
      }
      public static void main(String[] args){
        EmployeeC1 e1=new EmployeeC1(102,67890.90,'A');
	System.out.println(e1.id);
	System.out.println(e1.sal);
	System.out.println(e1.grade);
	}
}