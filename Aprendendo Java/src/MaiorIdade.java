import java.util.Scanner;

public class MaiorIdade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Voce é menor de idade!");
        }

    }
}