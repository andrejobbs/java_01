import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int n1 =leitor.nextInt();
            int n2 =leitor.nextInt();
            int produto =n1*n2;
            System.out.println("Prod:"+produto);
        }


    }
}
