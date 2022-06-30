import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva algo");
        String text = entrada.nextLine();
        entrada.close();
        System.out.println("Você escreveu isso:" + text);
    }
}
