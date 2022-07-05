import java.util.Scanner;

public class ex14{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int senha = leitor.nextInt();
            while (senha != 2002) {
            System.out.println("Senha incorreta");
            senha = leitor.nextInt();
        }
        System.out.println("Muito bem");
        }

    }
}