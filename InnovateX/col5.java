class col5
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={2,4};

  for(int i=0;i<arr.length;i++)
  {
   int b=(int)arr[i];
   int h=(int)arr[i];
   int res=b*h;
   System.out.println(res);
  }
 }
}