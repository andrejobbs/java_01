import java.util.Scanner;

public class ex13{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
     int n1 = leitor.nextInt();
     int n2 = leitor.nextInt();

while (n1 != n2) {
if (n1 > n2){
    System.out.println("Decrescente");
    break;
} 
else {System.out.println("Crescente");
break;
}
}
        }
    }
}