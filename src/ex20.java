import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();
        if (x == 0 && y == 0) {
        System.out.println("Esta na origem");} else if (x == 0) {
        System.out.println("Esta no eixo Y");
        } else if (y == 0) {
        System.out.println("Esta no eixo x");
        } else if (y > 0 && x > 0) {
        System.out.println("Q1");
        } else if (y > 0 && x < 0) {
        System.out.println("Q2");
        } else if (y < 0 && x < 0) {
        System.out.println("Q3");
        } else if (y < 0 && x > 0) {
        System.out.println("Q4");
        }
        }
    
}
}
