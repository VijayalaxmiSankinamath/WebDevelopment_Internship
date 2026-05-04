class Demoi{
    int x=90;
    }
  class PemaCha extends Demoi{
      void disp(){
         }
    }
    
    class casting{
       public static void main(String[] args){
         Demoi d1=new PemaCha();
	  System.out.println(d1.x);
	 PemaCha p1 = (PemaCha)d1;
	 System.out.println(p1.x);
	 p1.disp();
	 }
	 }
	 

       
	 