import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa CONTADOR");

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm + 1;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero " + (parametroUm + i));
        }
    }


}