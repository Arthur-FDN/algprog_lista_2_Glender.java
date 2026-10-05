import java.util.Scanner;

public class L02EX03 {
    public static void main(String[] args) {
        //Expressao: Sn = 1-1+2-2+3-3...n-n
        double r =0;
        Scanner escreve= new Scanner(System.in);
        System.out.print("Digite o numero que deseje saber o somatorio (sigma):");
        int n=escreve.nextInt();

        for(int i=1;i<=n;i++){
            r = r + Math.pow(i,i);
        }
        System.out.println(r);
        escreve.close();
    }
}
