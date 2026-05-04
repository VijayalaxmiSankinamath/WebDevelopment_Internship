class cool4{
void add(){
System.out.println("hii");
}
}
class goolata2 extends cool4{
int r=5;
void disp(){
System.out.println("hello");
}
}
class casting10{
public static void main(String[] args){
cool4 c1=new goolata2();
c1.add();
goolata2 g2=(goolata2)c1;
g2.add();
System.out.println(g2.r);
g2.disp();
}
}