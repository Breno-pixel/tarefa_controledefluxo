import java.util.Scanner;

public class controledefluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("A média das notas é: " + media);


        if (media >= 7) {
            System.out.println("Status: Aprovado!");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação.");
        } else {
            System.out.println("Status: Reprovado.");
        }

        scanner.close();
    }
}

