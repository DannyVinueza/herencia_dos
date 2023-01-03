import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {//Capitulo 9 pagina 409 del libro en español
    static Scanner sc = new Scanner("System.in");
    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercedes","E",55));
        listaVehiculos.add(new Autobus("Mercedes","M20",100,20));
        listaVehiculos.add(new Turismo("BMW" , "525",50,4));
        listaVehiculos.add(new Turismo("Audi", "A4", 55,4));
        listaVehiculos.add(new Autobus("Mercedes", "M10",120,30));
        listaVehiculos.add(new Turismo("VM","Passat",35,4));
        listaVehiculos.add(new Turismo("Audi", "A3", 30, 2));
        listaVehiculos.add(new Turismo("Mercedes", "E", 60,4));
        listaVehiculos.add(new Vehiculo("Audi", "A3",30));
        imprimirLista((ArrayList) listaVehiculos);

        int opPrincipal;
        boolean pausa = false;

        while(!pausa){
            opPrincipal = menuPrincipal();
            switch(opPrincipal){
                case 1:{
                    System.out.println("Va a ingresar vehiculos de cualquier tipo");
                }break;
                case 2:{
                    System.out.println("Va a ingresar vehiculos de tipo Autobus");
                }break;
                case 3:{
                    System.out.println("Va a ingresar vehiculos de tipo Turismo");
                }break;
                case 4:{
                    System.out.println("Saliendo......");
                }break;
            }
        }
    }

    public static int menuPrincipal(){
        int opcion = 0;
        System.out.println("\t\t\t****** Bienvenido al Programa ******");
        System.out.println("1. Ingresar Vehiculos");
        System.out.println("2. Ingresar Vehiculo de Tipo Autobus");
        System.out.println("3. Ingresar Vehiculo de Tipo Turismo");
        System.out.println("4. Salir");
        System.out.print("Opcion?: ");
        opcion = sc.nextInt();

        while ((opcion < 1) || (opcion > 4)){
            System.out.print("Ingrese una opcion entre el 1-4: ");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public static void imprimirLista(ArrayList lista){
        for(int i = 0; i < lista.size(); i++){
            Vehiculo v = (Vehiculo)lista.get(i);
            v.imprimirAtributos();

            System.out.println("");
        }
    }
}