class constructor
{
int a;
int b;
constructor()
{
a=10;
b=20;
}
constructor(int x, int y)
{
a=x;
b=y;
}
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class conex
{
public static void main(String[] args)
{
constructor a=new constructor(5,50);
a.display();
constructor b=new constructor();
b.display();
}
}