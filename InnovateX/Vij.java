class Vij{
  public static void main(String[] args){
	  System.out.println("main Starts");
      int[] arr = {10,20,30,40,50};
try{
	System.out.println(arr[5]);
}
catch(ArrayOutofBoundException e){
	System.out.println("handling");
}
  }
}
	