import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MainEx3 {
    private static  BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int min = 0;
        int max = 10;
        int tentative = 0;
        Random random = new Random();

        int secretValue = random.nextInt(max + min) + min;
        int value;
        do {
            tentative++;
            System.out.println("Veuillez taper un chiffre :");
            String input = reader.readLine();
            value = Integer.valueOf(input);
            if (value < secretValue) {
                System.out.println("plus haut");
            } else if (value > secretValue) {
                System.out.println("plus bas");
            }
        } while (secretValue != value);
        System.out.println("Félicitation! Votre chiffre était bien : " + value + ". Nombre de tentative : " + tentative);
    }
}
