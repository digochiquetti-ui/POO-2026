import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        Double n1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        Double n2 = sc.nextDouble();

        Double media = (n1+n2)/2;
        System.out.println("Sua média é: "+media);

        if (media >= 70){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


    }
}
