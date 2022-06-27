import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
           System.out.println("Atribua os valores para a formula:");
           int A = entradaUsuario.nextInt();
           int B = entradaUsuario.nextInt();
           int C = entradaUsuario.nextInt();
           
           double delta = Math.sqrt((B * B) - (4 * A * C));
           if(A <= 0 || delta <= 0)
           {
            System.out.println("Insira um valor valido:");
           }
           else
           {
               double x1 = (-B + delta)/(2*A);
               double x2 = (-B - delta)/(2*A);
                
               System.out.println("Valor de x1 : " + x1 );
               System.out.println("Valor de x2 : " + x2 );
           }
        }
    }
}