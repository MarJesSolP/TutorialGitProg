import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        final Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int number = teclado.nextInt();
        System.out.println("Holaa Mundo " + number + "!");
        teclado.close();
    }
}