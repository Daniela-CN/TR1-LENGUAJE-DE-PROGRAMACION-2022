public class Main {
    public static void main(String[] args) {

        Cliente cli = new Cliente();//clase cliente

        //ingresar los datos
        int dni = cli.resquestDNI();
        String password = cli.resquestPassword();
        String name = "";
        int saldo= 0;

        ValidarClientes val = new ValidarClientes(name, dni, password,saldo);//clase ValidarCliente

        //llamar metodos
        int validar = val.validateSesion(dni, password);

        if(validar==1) {
            name = val.getNameSesion(dni, password);
            saldo = val.getSaldoInicial(dni, password);

            Operaciones op = new Operaciones();//Clase Operaciones

            //llamar metodos
            op.getBalance(saldo);
            System.out.println("BIENVENIDO(A)!! " + name);
            op.validateMenu();
        }
        int cont = 1;//contador para intentos

        while (validar != 1 && cont < 3) {

            System.out.println("DATOS INCORRECTOS");
            System.out.println("INTENTE OTRA VEZ");

            dni = cli.resquestDNI();

            password = cli.resquestPassword();

            val = new ValidarClientes(name, dni, password, saldo);

            validar = val.validateSesion(dni, password);

            if (validar==1) {
                name = val.getNameSesion(dni, password);
                Operaciones op = new Operaciones();
                op.getBalance(saldo);
                System.out.println("BIENVENIDO(A)!! " + name);
                op.validateMenu();
            }cont++;
            if (cont == 3) {//3 intentos
                System.out.println("SU CUENTA ESTA BLOQUEADA");
            }

        }
    }

}
