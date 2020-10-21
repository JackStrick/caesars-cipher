import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner userInput = new Scanner(System.in);

       System.out.print("Enter Message: ");
       String message = userInput.nextLine();
       System.out.print("Enter Offset: ");
       int offset = userInput.nextInt();
       //String message = "how are you doing today";
       //int offset = 12;

       CaesarsCipher caesarsCipher = new CaesarsCipher();
       String cipheredMessage = caesarsCipher.cipher(message, offset);

       System.out.println("Ciphered message: " + cipheredMessage);
    }
}
