class tester3{
int r=6;
void disp(){
System.out.println("hii");
}
}
class tista extends tester3{
void uliya(){
System.out.println("hello");
}
}
class casting3{
public static void main(String[] args){
tester3 t3=new tista();
System.out.println(t3.r);
t3.disp();
tista t1=(tista)t3;
System.out.println(t1.r);
t1.disp();
t1.uliya();
}
}