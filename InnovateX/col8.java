class col8
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={4,3};

  for(int i=0;i<arr.length;i++)
  {
   int r=(int)arr[i];
   int theta=60;
   double res=0.5*r*r*theta;
   System.out.println(res);
  }
 }
}