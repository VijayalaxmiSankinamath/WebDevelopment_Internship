class tester1{
int x=5;
void disp(){
System.out.println("hii");
}
}
class huliyacha extends tester1{
void ho(){
System.out.println("hii hello");
}
}
class casting2{
public static void main(String[] args){
tester1 t1=new huliyacha();
System.out.println (t1.x);
t1.disp();
huliyacha h1=(huliyacha)t1;
System.out.println (h1.x);
h1.disp();
h1.ho();
}
}