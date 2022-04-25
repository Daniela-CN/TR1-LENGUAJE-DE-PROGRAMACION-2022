import java.util.Scanner;

public  class Operaciones {

    public static double balance,transacciones;

    public double getBalance(double balance1){

        balance=balance1;
        return balance;
    }

    int validate = 0;
    int option = 0;

    Scanner sc = new Scanner(System.in);

    protected double withdrawal , deposit;

    public void validateMenu(){

        do {
            do {
                System.out.println("-----------------------------------------------------");
                System.out.println("Seleccione una opción");
                System.out.println("[1] Deposito");
                System.out.println("[2] Retiro");
                System.out.println("[3] Consulta de Saldo");
                System.out.println("[4] Salir");
                System.out.println("-----------------------------------------------------");
                option = sc.nextInt();

                if (option >= 1 && option <= 4) {
                    validate = 1;
                } else {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("OPCIÓN NO DISPONIBLE, VUELVA A INTENTAR");
                    System.out.println("-----------------------------------------------------");
                }

            } while (validate == 0); //Se repite mientras la validacion sea igual a 0

            if(option ==1){

                toDeposit();

            }else if(option == 2){

                withdraw();

            }else if (option ==3){

                checkBalance();

            }else if (option ==4){

                System.out.println("-----------------------------------------------------");
                System.out.println("Gracias por su preferencia, vuelva pronto!! ^-^");
                System.out.println("-----------------------------------------------------");
                validate = 2;
            }
        }while(validate !=2);
    }

    //Retirar

    public void withdraw(){
        System.out.println("Cantidad a retirar");
        withdrawal = sc.nextDouble();
        if(withdrawal<= balance){
            transacciones = balance;
            balance=(transacciones - withdrawal);
            System.out.println("-----------------------------------------------------");
            System.out.println("Retiraste: " + withdrawal);
            System.out.println("Su saldo actual es: S/." + balance);
        }else{
            System.out.println("-----------------------------------------------------");
            System.out.println("SALDO INSUFICIENTE");
        }

    }

    //Depositar
    public void toDeposit(){
        System.out.println("Cantidad a depositar");
        deposit = sc.nextDouble();

        transacciones = balance;
        balance=transacciones + deposit;
        System.out.println("-----------------------------------------------------");
        System.out.println("Depositó: " + deposit);
        System.out.println("Su saldo actual es: S/." + balance);
    }

    public void checkBalance(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Usted tiene : S/." + balance);
    }

}
