import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx2 {
    private static  BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Veuillez taper un chiffre :");
        String input = reader.readLine();
        int value = Integer.valueOf(input);
        if(value<10){
            System.out.println("Le chiffre que vous avez rentré est plus petit que 10.");
        }else if(value>10){
            System.out.println("Le chiffre que vous avez rentré est plus grand que 10.");
        }else{
            System.out.println("Bravo!");
        }
    }
}
