import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int z= leitor.nextInt();
        if (x >= y && x >z ) {
        System.out.println(x);} else if (y>x && y>z) {
        System.out.println(y);
        } else if (z>x && z>y) {
        System.out.println(z);
        } 

{   System.out.println();
    System.out.println(x+","+y+","+z);
        }
        }
    
}

}