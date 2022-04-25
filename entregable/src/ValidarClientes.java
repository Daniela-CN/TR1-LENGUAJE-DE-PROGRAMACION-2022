import java.util.ArrayList;

public class ValidarClientes {

    ArrayList<ValidarClientes> clientes = new ArrayList<>();//Arraylist

    String name, password; int dni, saldo;//variables

     //constructor
    public ValidarClientes(String name, int dni, String password,int saldo) {
        this.name = name;
        this.password = password;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void registeredCustomers(){

        ValidarClientes cliente1 = new ValidarClientes("Daarick Leeroy Lujan Abril ",11111111,"abc123",0);
        ValidarClientes cliente2 = new ValidarClientes("Anthony Bullón Gonzales",22222222,"laprabuffy96",0);
        ValidarClientes cliente3 = new ValidarClientes("Lucy Weird Ruiz ",33333333,"12345@",0);
        ValidarClientes cliente4 = new ValidarClientes("Ana Siloe Anchiraico Martín",44444444,"usuiBL03",0);
        ValidarClientes cliente5 = new ValidarClientes("Jeferson Mario Escurra Ichpas",55555555,"mario2000",0);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
    }

    public int validateSesion(int dni, String password) {
        registeredCustomers();
        int cont=0;
        for (int i = 0; i <5; i++) {
            if (clientes.get(i).dni==dni) {
                for (int j = i; j ==i; j++) {
                    if(clientes.get(j).password.equals(password)) {
                        cont=1;
                    }
                }
            }
        }
        return cont;
    }

    public String getNameSesion(int dni, String password) {
        registeredCustomers();
        String name =null;
        for (int i = 0; i <5; i++) {
            if (clientes.get(i).dni==dni) {
                for (int j = i; j ==i; j++) {
                    if(clientes.get(j).password.equals(password)) {
                        name = clientes.get(j).name;
                    }
                }
            }
        }
        return name;
    }

    public int getSaldoInicial(int dni, String password) {
        registeredCustomers();
        name = getNameSesion(dni,password);
        int saldo =0;
        for (int i = 0; i <5; i++) {
            if (clientes.get(i).name.equals(name)) {
                saldo=clientes.get(i).saldo;
            }
        }
        return saldo;
    }

}
