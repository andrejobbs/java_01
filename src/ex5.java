import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws Exception {
        try (Scanner entradaUsuario = new Scanner(System.in)){
            System.out.println("Digite um valor:");
            int valor = entradaUsuario.nextInt();

            int cedulaDe100 = 0;
            int cedulaDe50 = 0;
            int cedulaDe20 = 0;
            int cedulaDe10 = 0;
            int cedulaDe5 = 0;
            int cedulaDe2 = 0;
            int cedulaDe1 = 0;
            
            while(valor > 0){
                if(valor >= 100)
                {
                    cedulaDe100++;
                    valor -= 100;
                }
                else if(valor >= 50)
                {
                    cedulaDe50++;
                    valor -= 50;
                }
                else if(valor >= 20)
                {
                    cedulaDe20++;
                    valor -= 20;
                }
                else if(valor >= 10)
                {
                    cedulaDe10++;
                    valor -= 10;
                }
                else if(valor >= 5)
                {
                    cedulaDe5++;
                    valor -= 5;
                }
                else if(valor >= 2)
                {
                    cedulaDe2++;
                    valor -= 2;
                }
                else if(valor >= 1)
                {
                    cedulaDe1++;
                    valor -= 1;
                }
            }
              
            System.out.println(cedulaDe100 + " nota(s) de R$ 100,00");
            System.out.println(cedulaDe50 + " nota(s) de R$ 50,00");
            System.out.println(cedulaDe20 + " nota(s) de R$ 20,00");
            System.out.println(cedulaDe10 + " nota(s) de R$ 10,00");
            System.out.println(cedulaDe5 + " nota(s) de R$ 5,00");
            System.out.println(cedulaDe2 + " nota(s) de R$ 2,00");
            System.out.println(cedulaDe1 + " nota(s) de R$ 1,00");

        }
    }
}