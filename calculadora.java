import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
         
        System.out.println("Bienvenido a la calculadora");
        System.out.print("Escoge una opcion: \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n");
        int opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
  public static void suma() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    int num2 = sc.nextInt();
    int resultado = num1 + num2;
    System.out.println("El resultado de la suma es: " + resultado);
}

public static void resta() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    int num2 = sc.nextInt();
    int resultado = num1 - num2;
    System.out.println("El resultado de la resta es: " + resultado);
}

public static void multiplicacion() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    int num2 = sc.nextInt();
    int resultado = num1 * num2;
    System.out.println("El resultado de la multiplicacion es: " + resultado);
}


public static void division() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    int num2 = sc.nextInt();
    
    if (num2 == 0) {
        System.out.println("Error: No se puede dividir entre cero.");
        return;
    }else{
        double resultado = (double) num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
    }
}
}
