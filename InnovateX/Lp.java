class Lp{
   public static void main(String[] args){
	   int n=7077;
	   int count=0;
	   while(n !=0){
		   int rem = n % 10;
		   count++;
		   n=n/10;
	   }
	   System.out.println(count);
   }
}