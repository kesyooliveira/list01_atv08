import java.util.Scanner;

class list01_atv08 {
    public static void main (String [] args) {
        System.out.println("Cálculo de salário.\n");
        Double valorHora;
        Double quantHora;
        System.out.print("Informe o valor de cada hora: ");
        Scanner sc = new Scanner(System.in);
        valorHora = sc.nextDouble();
        System.out.print("Informe o número de horas trabalhadas: ");
        quantHora = sc.nextDouble();
        sc.close();

        Double total = (valorHora*quantHora);

        System.out.printf("O salário referente à esse mês é de R$%.2f.",total);
    }
}
