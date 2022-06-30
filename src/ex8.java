import java.util.Scanner;

public class ex8{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int x=leitor.nextInt();
            int y=leitor.nextInt();
            if (y==0) System.out.println("impossivel dividir"); 
               
            else System.out.println((double) x / y);
            }
            
            
        }

}
