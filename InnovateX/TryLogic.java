public class TryLogic{
   public static void main(String[] args){
         int n= 134567;
	 int count=0;
	/* while(n!=0){
	    int rem=n%10;
	    sum=sum+rem;
	    n=n/10;
	    }
	    System.out.println(sum);
	  }
 }
 */
 
 while(n!=0){
	 int rem = n %10;
	 if(rem % 2 != 0){
	 count++;
	 }
	 n=n/10;
	 }
 	 System.out.println(count);
   }
}