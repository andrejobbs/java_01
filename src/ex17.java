import java.util.Scanner;

public class ex17{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
            int notaa = leitor.nextInt();
            int notab = leitor.nextInt();
            int notac = leitor.nextInt();
            int notad = leitor.nextInt();
            int somacd=(notac+notad);
            int somaab=(notaa+notab);

            if ((notab > notac) && (notad> notaa) &&(somacd>0 && somaab>0) && (notaa%2==0) )
             {System.out.println("VAlORES ACEITOS");

            }else{
                System.out.println("VAlORES NAO ACEITOS");
                }
            

                


            }
        }
    }

