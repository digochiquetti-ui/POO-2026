import java.util.Scanner;
public class Parouimpar {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n1 = sc.nextInt();

        if (n1 % 2 == 0){
            System.out.println("Numero par");
        }
        else {
            System.out.println("Numero impar");
        }

    }
}
