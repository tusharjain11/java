public class Dup {

    public static void main(String[] args) {

        String input = new String("abbcddfgjgfcjfhdjds");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
         if(output.indexOf(input.charAt(i))== -1)
                    output = output + input.charAt(i);
        }
	
        System.out.println(output);

    }

}