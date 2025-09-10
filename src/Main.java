import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Clark Kent";
        String accountType = "Corrente";
        double balance = 5000.00;
        int option = 0;
        String menu = """
                \n**Digite sua opção**
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        System.out.println("***********************");
        System.out.println("\nNome: " + name);
        System.out.println("Tipo da conta" + accountType);
        System.out.println("Saldo: R$ " + balance );
        System.out.println("\n***********************");

        Scanner read = new Scanner(System.in);
        while (option != 4){
            System.out.println(menu);
            option = read.nextInt();

            if (option == 1){
                System.out.println("Seu saldo atualizado é: " + balance);
            } else if (option == 2) {
                System.out.println("Informe o valor a receber:");
                double valor = read.nextDouble();
                balance = balance +valor;
                System.out.println("Seu novo saldo é: " + balance);
            } else if (option == 3) {
                System.out.println("Informe valor a transferir:");
                double valor = read.nextDouble();
                if (valor > balance){
                    System.out.println("Esse valor é maior que o seu saldo, não é possivel transferir!");
                } else {
                    balance = balance - valor;
                    System.out.println("\nSeu novo saldo é: " + balance);
                }
            } else if (option != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
