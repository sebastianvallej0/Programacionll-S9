import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(40, 5.0);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar un carro al parqueadero");
            System.out.println("2. Dar salida a un carro del parqueadero");
            System.out.println("3. Informar los ingresos del parqueadero");
            System.out.println("4. Consultar la cantidad de puestos disponibles");
            System.out.println("5. Avanzar el reloj del parqueadero");
            System.out.println("6. Cambiar la tarifa del parqueadero");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa del carro: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese la hora de entrada del carro: ");
                    int horaEntrada = scanner.nextInt();
                    parqueadero.ingresarCarro(placa, horaEntrada);
                    break;
                case 2:
                    System.out.print("Ingrese la placa del carro a sacar: ");
                    String placaSalida = scanner.next();
                    System.out.print("Ingrese la hora de salida del carro: ");
                    int horaSalida = scanner.nextInt();
                    parqueadero.sacarCarro(placaSalida, horaSalida);
                    break;
                case 3:
                    double ingresos = parqueadero.calcularIngresosTotales();
                    System.out.println("Ingresos totales del parqueadero: $" + ingresos);
                    break;
                case 4:
                    int puestosDisponibles = parqueadero.obtenerPuestosDisponibles();
                    System.out.println("Puestos de estacionamiento disponibles: " + puestosDisponibles);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de horas a avanzar: ");
                    int horasAvanzar = scanner.nextInt();
                    parqueadero.avanzarReloj(horasAvanzar);
                    System.out.println("Reloj del parqueadero avanzado por " + horasAvanzar + " horas.");
                    break;
                case 6:
                    System.out.print("Ingrese la nueva tarifa por hora: ");
                    double nuevaTarifa = scanner.nextDouble();
                    parqueadero.cambiarTarifaPorHora(nuevaTarifa);
                    break;
                // ... (resto de las opciones, similar a la implementación anterior)
                case 7:
                    double tiempoPromedio = parqueadero.darTiempoPromedio();
                    System.out.println("Tiempo promedio de los carros en el parqueadero: " + tiempoPromedio + " horas.");
                    break;
                case 8:
                    Caro carroMasHoras = parqueadero.carroConMasHoras();
                    if (carroMasHoras != null) {
                        System.out.println("El carro con más horas en el parqueadero tiene la placa: " + carroMasHoras.getPlaca());
                    } else {
                        System.out.println("No hay carros estacionados en el parqueadero.");
                    }
                    break;
                case 9:
                    boolean hayCarroOchoHoras = parqueadero.hayCarroMasDeOchoHoras();
                    System.out.println("¿Hay algún carro parqueado por más de 8 horas? " + (hayCarroOchoHoras ? "Sí." : "No."));
                    break;
                case 10:
                    ArrayList<Caro> carrosMasTresHoras = parqueadero.darCarrosMasDeTresHorasParqueados();
                    if (carrosMasTresHoras.isEmpty()) {
                        System.out.println("No hay carros parqueados por más de tres horas.");
                    } else {
                        System.out.println("Carros parqueados por más de tres horas:");
                        for (Caro carro : carrosMasTresHoras) {
                            System.out.println("- Placa: " + carro.getPlaca());
                        }
                    }
                    break;
                case 11:
                    boolean hayCarrosPlacaIgual = parqueadero.hayCarrosPlacaIgual();
                    System.out.println("¿Hay carros con placas iguales? " + (hayCarrosPlacaIgual ? "Sí." : "No."));
                    break;
                case 12:
                    int carrosPlacaPB = parqueadero.contarCarrosQueComienzanConPlacaPB();
                    boolean hayCarro24Horas = parqueadero.hayCarroCon24Horas();
                    System.out.println("Cantidad de carros con placa PB: " + carrosPlacaPB + " - Hay carro parqueado por 24 o más horas: " + (hayCarro24Horas ? "Sí." : "No."));
                    break;
                case 13:
                    String mensajeDesocupar = parqueadero.metodo2();
                    System.out.println(mensajeDesocupar);
                    break;
                // ... (resto de las opciones, similar a la implementación anterior)
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
