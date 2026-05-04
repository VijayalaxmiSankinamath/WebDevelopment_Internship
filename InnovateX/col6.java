class col6
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={2,3,4};

  for(int i=0;i<arr.length;i++)
  {
   int a=(int)arr[i];
   int b=(int)arr[i];
   int h=(int)arr[i];
   double res=0.5*(a+b)*h;
   System.out.println(res);
  }
 }
}