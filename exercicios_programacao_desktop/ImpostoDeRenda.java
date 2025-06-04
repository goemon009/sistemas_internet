import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salario;

        try{
            System.out.println("Digite o seu salário: ");
            salario = scanner.nextDouble();

            if(salario <= 2000.00){
                System.out.println("Isento");
            }else{
                double calcImposto = imposto(salario);
                System.out.printf("R$ %.2f\n", calcImposto);
            }               
            
        }catch (InputMismatchException e){
            System.err.println("Exception: " + e);
            scanner.nextLine();
            System.err.println("Insira um salário válido.");
        }        
        scanner.close();
    }

    public static double imposto(double salario){
        double imposto = 0;
        if(salario > 4500.00){
            imposto = imposto + (salario - 4500.00) * 0.28;
            salario = 4500.00;
        } else if (salario > 3000.00){
            imposto = imposto + (salario - 3000.00) * 0.18;
            salario = 3000.00;
        } else if (salario > 2000){
            imposto = imposto + (salario - 2000.00) * 0.08;
        }
        return imposto;
    }
}
