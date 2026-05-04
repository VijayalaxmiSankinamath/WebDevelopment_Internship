class col1
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={10,20};

  for(int i=0;i<arr.length;i++)
  {
   final double pi=3.142;
   int r=(int)arr[i];
   double res=pi*r*r;
   System.out.println(res);
  }
 }
}