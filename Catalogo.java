import java.util.Scanner;
//Diego Mendoza, Ximena Gutiérrez
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Calculadora Simple");
            System.out.println("2. Contador de Positivos y Negativos");
            System.out.println("3. Suma de los Primeros N Numeros");
            System.out.println("4. Menu de Conversiones");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    double num1, num2;
                    char operacion;

                    System.out.print("Ingresa el primer numero: ");
                    num1 = leer.nextDouble();

                    System.out.print("Ingresa el segundo numero: ");
                    num2 = leer.nextDouble();

                    System.out.print("Operacion (+, -, *, /): ");
                    operacion = leer.next().charAt(0);

                    switch (operacion) {
                        case '+':
                            System.out.println("Resultado: " + (num1 + num2));
                            break;

                        case '-':
                            System.out.println("Resultado: " + (num1 - num2));
                            break;

                        case '*':
                            System.out.println("Resultado: " + (num1 * num2));
                            break;

                        case '/':
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("Error: No se puede dividir entre cero.");
                            }
                            break;

                        default:
                            System.out.println("Operacion no valida.");
                    }
                    break;

                case 2:
                    int numero;
                    int positivos = 0;
                    int negativos = 0;

                    System.out.print("Ingresa un numero (0 para terminar): ");
                    numero = leer.nextInt();

                    while (numero != 0) {
                        if (numero > 0) {
                            positivos++;
                        } else {
                            negativos++;
                        }

                        System.out.print("Ingresa otro numero (0 para terminar): ");
                        numero = leer.nextInt();
                    }

                    System.out.println("Numeros positivos: " + positivos);
                    System.out.println("Numeros negativos: " + negativos);
                    break;

                case 3:
                    int N;
                    int contador = 1;
                    int suma = 0;

                    System.out.print("Ingresa un numero entero positivo: ");
                    N = leer.nextInt();

                    if (N > 0) {
                        do {
                            suma = suma + contador;
                            contador++;
                        } while (contador <= N);

                        System.out.println("La suma es: " + suma);
                    } else {
                        System.out.println("Ingresa un numero mayor que cero.");
                    }
                    break;

                case 4:
                    int conversion;
                    double dato, resultado;

                    System.out.println("\n===== CONVERSIONES =====");
                    System.out.println("1. Celsius a Fahrenheit");
                    System.out.println("2. Km/h a m/s");
                    System.out.println("3. Pesos a dolares");
                    System.out.print("Selecciona una conversion: ");
                    conversion = leer.nextInt();

                    switch (conversion) {
                        case 1:
                            System.out.print("Ingresa grados Celsius: ");
                            dato = leer.nextDouble();

                            resultado = (dato * 9 / 5) + 32;

                            System.out.println("Fahrenheit: " + resultado);
                            break;

                        case 2:
                            System.out.print("Ingresa km/h: ");
                            dato = leer.nextDouble();

                            resultado = dato / 3.6;

                            System.out.println("Metros por segundo: " + resultado);
                            break;

                        case 3:
                            System.out.print("Ingresa pesos mexicanos: ");
                            dato = leer.nextDouble();

                            resultado = dato / 18.00;

                            System.out.println("Dolares: $" + resultado);
                            break;

                        default:
                            System.out.println("Conversion no valida.");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 5);

        leer.close();
    }
}
