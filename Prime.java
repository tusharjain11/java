
import java.util.Scanner;
public class Prime {
public static void main(String[] args)throws IO Exception {
Scanner s = new Scanner(System.in);
int ctr=0;
System.out.print("Enter a number: ");
int n = s.nextInt();
for(int i=0;i<=n;i++)
{
if(n%i==0)
ctr++;
}
if(ctr==2)
System.out.print("It is Prime");
else
System.out.print("Not Prime");
}
}