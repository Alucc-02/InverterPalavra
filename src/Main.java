import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String palavra;
        System.out.print("Digite sua palavra: ");
        palavra = t.nextLine(); //usar .nextLine() em vez de .next()

        for (int i = palavra.length(); i>0; i--){
            System.out.print(palavra.charAt(i-1));
        }
    }
}