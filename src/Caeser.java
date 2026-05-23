import java.util.Scanner;

public class Caeser{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the sentence you want to decode.");
        String text = sc.nextLine();

        System.out.println("Input the number you want to go back the order.");
        int shift = sc.nextInt();


        StringBuilder result = new StringBuilder();


        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if(c >= 'a' && c <= 'z'){
                int number = c -'a';

                int shifted = (number - shift + 26) % 26;

                char decoded = (char)('a' + shifted);

                result.append(decoded);
            }else if(c >= 'A' && c <= 'Z'){
                int number = c -'A';

                int shifted = (number - shift + 26) % 26;

                char decoded = (char)('A' + shifted);

                result.append(decoded);
            }else{
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}