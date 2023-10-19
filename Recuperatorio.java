import java.util.Scanner;

public class Recuperatorio {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double precio = 2500;
        double precioFinal = 0;
        double iva = 0.15;
        int seleccion =0;

        System.out.println("Precio inicial: " +precio);

        System.out.println("Elija que desea hacer con el precio del producto");
        System.out.println("1. sumar iva");
        System.out.println("2. restar iva");
        System.out.println("3. multiplicar iva");
        System.out.println("4. dividir iva");
        System.out.println("0. salir de la calculadora");
        seleccion = sc.nextInt();


        while (seleccion != 0) {
            if (seleccion == 1) {
                precioFinal = precio + precio*iva;
                System.out.println("Precio final: " +precioFinal);
            } else if (seleccion == 2) {
                precioFinal = precio - precio*iva;
                System.out.println("Precio final: " +precioFinal);
            } else if (seleccion == 3) {
                precioFinal = precio * precio*iva;
                System.out.println("Precio final: " +precioFinal);
            } else if (seleccion == 4) {
                precioFinal = precio / precio*iva;
                System.out.println("Precio final: " +precioFinal);
            } else if (seleccion == 0) {
                break;
            } else {
                System.out.println("Numero equivocado");
                break;
            }


            System.out.println("1. sumar iva");
            System.out.println("2. restar iva");
            System.out.println("3. multiplicar iva");
            System.out.println("4. dividir iva");
            System.out.println("0. salir de la calculadora");
            seleccion = sc.nextInt();
        }
    }
}
