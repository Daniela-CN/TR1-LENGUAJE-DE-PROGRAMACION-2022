import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    
    public int resquestDNI(){
        int dni;
        String dniv;
        Scanner sc= new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Número de DNI:");
                dni = sc.nextInt();
                dniv = String.valueOf(dni);
                while (dniv.length() != 8) {
                    System.out.println("RECUERDE QUE EL NÚMERO DE DNI TIENE 8 DÍGITOS");
                    System.out.println("Número de DNI:");
                    dni = sc.nextInt();
                    dniv = String.valueOf(dni);
                }break;
            } catch (InputMismatchException ex) {
                System.out.println("RECUERDE QUE EL NÚMERO DE DNI TIENE 8 DÍGITOS");
                sc.next();}
        }return dni;
    }
    public String resquestPassword(){
        String password= "";

        Console cons;

        if((cons = System.console())!=null) {
            char [] clave = cons.readPassword("Ingrese su contraseña :");
            password = String.valueOf(clave);
        }
        //enmascarar input
        for(int i =0; i<password.length(); i++) {
            if(password != null)
                System.out.print("*");
        }
        System.out.println();

        return password;
    }



}
