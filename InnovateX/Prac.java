class Prac{
   public static void main(String[] args){
      String s1="Hello";
      String s2="World";
      System.out.println(s1 + s2);
	  
	  /*****************/
	  
	  String s3="iam      ";
	  s3=s3.replaceAll(" +","");
	  if(s3.isEmpty()){
		  System.out.println("only white");
      }else{
		  System.out.println("not");
	  }
	  
	  
	  /**********************************/
	  
	  
	  s1=s1.replace("l","");
	  System.out.println(s1);
   }
      }