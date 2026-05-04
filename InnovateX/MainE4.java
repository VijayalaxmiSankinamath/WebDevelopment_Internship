class School {
    String name;
    String grade;
    int strength;

    School(String name, String grade, int strength) {
        this.name = name;
        this.grade = grade;
        this.strength = strength;
    }

   public boolean equals(Object obj){
     School s2=(School )obj;
     return this.name==s2.name;
	}
}


public class MainE4 {
    public static void main(String[] args) {

       
  School s1 = new School("Green Valley School", "A Grade", 1200);
   School s2 = new School("Green Valley Schools", "B Grade", 1250);
     if(s1.equals(s2)){
     System.out.println("*****");
         }else{
	 System.out.println("@@@@@@");
	 }
	 }
}