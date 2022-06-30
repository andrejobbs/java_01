import java.util.Scanner;

public class ex10{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int n=leitor.nextInt();
            //int y = 1;//
            int i=1;
            
            for (;i < n; i++);{
                i=leitor.nextInt();
                System.out.println(i+""+n);

        }
    }
            
        } 
        /*N = int(input())
        Y = 1
        
        for N in range(N):
         X = int(input())
         print(f"resposta {Y}: {X}")
         Y += 1 */

}
