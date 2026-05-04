class cool2{
void disp(){
System.out.println("hiii");
}
}
class dinga extends cool2{
void tata(){
System.out.println("hii");
}
int x=56;

}
class casting8{
public static void main(String[] args){
cool2 c2=new dinga();
c2.disp();
dinga d1=(dinga)c2;
d1.disp();
d1.tata();
System.out.println(d1.x);
}
}