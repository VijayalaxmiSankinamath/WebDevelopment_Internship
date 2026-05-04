class sample2{
void ho(){
System.out.println("hiiii");
}
}
class guleylulu extends sample2{
void disp(){
System.out.println("heloooo");
}
}
class casting5{
public static void main(String[] args){
sample2 s1=new guleylulu();
s1.ho();
guleylulu g1=(guleylulu)s1;
g1.ho();
g1.disp();
}
}