import java.util.Scanner;
public class Cria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        int i = 1;
        while (i <= 10) {
            System.out.println(nome);
            i++;
        }
    }
}
