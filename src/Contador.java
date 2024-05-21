import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametro1 = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametro2 = sc.nextInt();

        try {
            System.out.println();
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
            throw new RuntimeException(e);
        }

        sc.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro2 <= parametro1) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametro2 - parametro1;
            System.out.println("Realizaremos uma contagem até " + contagem + ".");

            for(int i = 0; i < contagem; ++i) {
                System.out.println("Imprimindo o número " + (i + 1));
            }

        }
    }
}
