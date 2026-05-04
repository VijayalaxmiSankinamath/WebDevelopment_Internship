class EmployeeT{
  int id;
  double sal;
  char grade;
    EmployeeT(int id,double sal,char grade){
		this.id=id;
		this.sal=sal;
		this.grade=grade;
	}
	public String toString(){
		return this.id + " " + this.sal+" " + this.grade;
	}
	public static void main(String[] args){
		EmployeeT e1= new EmployeeT(102,56000.00,'A');
		System.out.println(e1.toString());
	}
}