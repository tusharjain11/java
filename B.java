class A{
A(){System.out.println("This is A constrctor");}
}
class B extends A
{
A(){System.out.println("This is cclass B with A consttr");}
public static void main(String args[])
{
B b= new B();
b.A();
}
}