class col4
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={2,4,3};

  for(int i=0;i<arr.length;i++)
  {
   int a=(int)arr[i];
   int res=a*a;
   System.out.println(res);
  }
 }
}