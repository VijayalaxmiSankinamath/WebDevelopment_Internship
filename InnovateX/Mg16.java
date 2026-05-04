class Gm16{
   void sector(int r,int theta){
   double area=0.5*r*r*theta;
    System.out.println(area);
    }
    }
    class Mg16{
      public static void main(String[] args){
        Gm16 g1= new Gm16();
	g1.sector(7,60);
	}
}