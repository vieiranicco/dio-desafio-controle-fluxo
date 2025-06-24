import java.util.Scanner;

public class Contador {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Digite o primeiro parametro");
            int firstNum = scanner.nextInt();
            System.out.println("Digite o segundo parametro");
            int secondNum = scanner.nextInt();
            contar(firstNum, secondNum);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int firstNum, int secondNum) throws ParametrosInvalidosException {

        if(firstNum > secondNum) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = secondNum - firstNum;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}