/*import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int autonomia=12;
            System.out.println("Insira a disntancia:");
            int distancia =leitor.nextInt();
            System.out.println("Insira a velocidade media:");
            int velocidade_media =leitor.nextInt();
            System.out.println(String.format("%..3f",autonomia));
            int produto =((distancia*velocidade_media)/autonomia);
            System.out.println("Tanque:"+produto);
        }


    }
}/* */
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor= new Scanner(System.in);
 
        int tempo =  leitor.nextInt();
        int distancia =  leitor.nextInt();
        
        double media= tempo*distancia;
        double media2 = media/12;

        System.out.println(media2);




    }
}

