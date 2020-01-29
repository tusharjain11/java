public class Rep
{   
	public static void main(String[] args) {
	 int i,j;
	 String str = "abchfgdhferhfjefh";
String a[] = str.split("");
  for(i=0; i<str.length(); i++){
                for(j=i+1; j<str.length(); j++){
                    if(a[i].equals(a[j])) {
                        System.out.println(a[i]);
                    }
                }
            }
	}
}