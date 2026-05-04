class col3
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={5,3};

  for(int i=0;i<arr.length;i++)
  {
   int w=(int)arr[i];
   int h=(int)arr[i];
   int res=w*h;
   System.out.println(res);
  }
 }
}