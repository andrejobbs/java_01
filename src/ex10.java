import java.util.Scanner;

public class ex10{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int n=leitor.nextInt();
            int i = 0;
            for (;i < n; i++);{
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
        }
    }
            
        }

}
