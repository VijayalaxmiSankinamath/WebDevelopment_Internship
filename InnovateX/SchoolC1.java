class SchoolC1{
    String name;
    char grade;
    int strength;
    SchoolC1(String name,char grade,int strength){
      this.name=name;
      this.grade=grade;
      this.strength=strength;
      }
      public static void main(String[] args){
        SchoolC1 s1=new SchoolC1("xyz",'A',500);
	System.out.println(s1.name);
	System.out.println(s1.grade);
	System.out.println(s1.strength);
	}
}