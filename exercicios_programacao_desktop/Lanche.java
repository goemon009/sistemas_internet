import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int codigo = 0;
        double total = 0, qntde = 0;

        do{
            try{
                System.out.println("Digite o código do produto: ");
                codigo = scanner.nextInt();
                System.out.println("Digite a quantidade");
                qntde = scanner.nextDouble();

                switch (codigo){
                    case 1:
                        double preco = 4;
                        total = conta(preco, qntde);
                        System.out.printf("Total: R$ %.2f\n", total);
                        break;
                    case 2:
                        preco = 4.5;
                        total = conta(preco, qntde);
                        System.out.printf("Total: R$ %.2f\n", total);
                        break;
                    case 3:
                        preco = 5;
                        total = conta(preco, qntde);
                        System.out.printf("Total: R$ %.2f\n", total);
                        break;
                    case 4:
                        preco = 2;
                        total = conta(preco, qntde);
                        System.out.printf("Total: R$ %.2f\n", total);
                        break;
                    case 5:
                        preco = 1.5;
                        total = conta(preco, qntde);
                        System.out.printf("Total: R$ %.2f\n", total);
                        break;
                    default:
                        throw new ArithmeticException("Código Inválido.");
                }
                loop = false;
            }catch (InputMismatchException e){
                System.err.println("Exception: " + e);
                scanner.nextLine();
                System.err.println("Insira um número válido");
            }catch (ArithmeticException e){
                System.err.println("Erro: " + e.getMessage());
            }
        }while (loop);

        scanner.close();
    }

    public static double conta(double codigo, double qntde){
        double total_conta;
        total_conta = codigo * qntde;
        return total_conta;
    }
}
