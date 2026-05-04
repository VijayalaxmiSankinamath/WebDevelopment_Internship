class Seven1{
  void sector(int r,int theta){
     double area=0.5*r*r*theta;
     System.out.println(area);
     }
     public static void main(String[] args){
     new Seven1().sector(3,60);
     }
     }