import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            String nome=leitor.next();
            double valor_vendas =leitor.nextDouble();
            double comissao =15;
            double valor_porcentagem =(valor_vendas*comissao)/100;
            double valor_total= valor_porcentagem+valor_vendas;
            
            System.out.println("Val total:"+valor_total);
        }


    }
}
