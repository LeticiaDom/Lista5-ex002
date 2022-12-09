import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt(); 
        sc.close();

        linhas(n);
    } 
    public static void linhas(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
