class col2
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={10,30};

  for(int i=0;i<arr.length;i++)
  {
   int b=(int)arr[i];
   int h=(int)arr[i];
   double res=0.5*b*h;
   System.out.println(res);
  }
 }
}