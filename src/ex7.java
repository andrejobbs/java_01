import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int count =0;
            for (int i=0;i< 5; i++){
                double n=leitor.nextDouble();
                if (n % 2 == 0 ) count++;
                

            }
            
            System.out.println("PARES: "+ count);
        }


    }
}
