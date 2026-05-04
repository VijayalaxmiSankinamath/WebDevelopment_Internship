class SchoolC{
    String name;
    char grade;
    int strength;
    SchoolC(String a,char b,int c){
      name=a;
      grade=b;
      strength=c;
      }
      public static void main(String[] args){
        SchoolC s1=new SchoolC("xyz",'A',500);
	System.out.println(s1.name);
	System.out.println(s1.grade);
	System.out.println(s1.strength);
	}
}