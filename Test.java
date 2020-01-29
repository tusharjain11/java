import java.io.*;
class A
{
void m1() throws IOException{}
}
class Bb extends A
{
void m1() throws Exception{}
}
class Test
{
public static void main(String[] s)
{ System.out.println("Good program");}
}