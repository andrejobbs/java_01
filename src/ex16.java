import java.util.Scanner;

public class ex16{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
            int cont_nota =0;
            double recebe_nota=0;
            double nota=0;
            while (nota >= 0) {nota = leitor.nextDouble();
                if (nota>=0){
                cont_nota++;
                recebe_nota=+nota;
                }
            }

                

{               Double media=recebe_nota/cont_nota;
                System.out.println("Sua media é"+ media);
                
                
                }

            }
        }
    }

