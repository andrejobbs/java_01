import java.util.Scanner;

public class ex15{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
            int etanol =0;
            int gasolina=0;
            int diesel=0;
            int op=1;
            while (op != 4) {op = leitor.nextInt();{
                op= leitor.nextInt();
            }
            switch (op) {
                case 1: etanol++;
                case 2: gasolina++;
                case 3: diesel ++;

                {
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + etanol);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                }

            }
        }
    }
}
}
