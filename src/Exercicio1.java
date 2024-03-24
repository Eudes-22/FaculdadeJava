import java.util.Scanner;
public class Exercicio1 {
    static public class Aluno {
        int nota1, nota2, nota3;

        public double calculaMedia() {
            double media = (nota1 + nota2 + nota3)/3;
            return media;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.printf("Digite a nota 1: ");
        aluno.nota1 = scanner.nextInt();
        System.out.printf("Digite a nota 2: ");
        aluno.nota2 = scanner.nextInt();
        System.out.printf("Digite a nota 3: ");
        aluno.nota3 = scanner.nextInt();

        double media = aluno.calculaMedia();
        System.out.printf("media das notas: " + media);
    }
}
