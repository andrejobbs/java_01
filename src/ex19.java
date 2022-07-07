import java.util.Scanner;

public class ex19{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
            Double notaa = leitor.nextDouble();
            Double notab = leitor.nextDouble();
            Double notac = leitor.nextDouble();
            Double notad = leitor.nextDouble();
            Double media=(notaa*2)+(notab*3)+(notac*4)+(notad*1)/10;
            if (media >= 7.0){
             System.out.println("Você foi aprovado");
            }else if  (media<4.0){
                System.out.println("Voce foi reprovador");
             }
            else if ((media <=7.0) && (media>=40.0)) {
                System.out.println("Vocé foi selecionado para o exame:");
                double nota_exame=leitor.nextDouble();
                double nova_nota=(media+nota_exame)/2;
                if (nova_nota>=5.0){
                    System.out.println("Parabens voce foi aprovado no exame");
                }
                else{
                    System.out.println("Voce reprovou");
                }
                {

                    
                }
                }
            

                


            }
        }
    }

