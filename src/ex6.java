import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int count =0;
            for (int i=0;i< 6; i++){
                double n=leitor.nextDouble();
                
                if(n>0) count ++;

            }
            
            System.out.println("numeros"+ count);
        }


    }
}
