import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();

        System.out.println("Cuál es tu edad?");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println(String.format("Hola %s de %d años", nombre, edad));

        if (edad % 2 == 0){
            System.out.println("Edad par");
        } else {
            System.out.println("Edad impar");
        }

        int a = 0;

        while (a < 5){
            a++;
            System.out.println("a = " + a);
        }

    }
}
