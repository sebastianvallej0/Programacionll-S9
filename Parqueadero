import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parqueadero {
    private PuestoEstacionamiento[] puestosEstacionamiento;
    private ArrayList<Caro> carrosEstacionados;
    private double tarifaPorHora;
    private double ingresosTotales;
    public void avanzarReloj(int horas) {

        for (Caro carro : carrosEstacionados) {
            carro.setHoraEntrada(carro.getHoraEntrada() + horas);
        }
    }



    public Parqueadero(int totalPuestos, double tarifaPorHora) {
        puestosEstacionamiento = new PuestoEstacionamiento[totalPuestos];
        carrosEstacionados = new ArrayList<>();
        this.tarifaPorHora = tarifaPorHora;
        this.ingresosTotales = 0;

        for (int i = 0; i < totalPuestos; i++) {
            puestosEstacionamiento[i] = new PuestoEstacionamiento(i + 1);
        }
    }

    public void ingresarCarro(String placa, int horaEntrada) {
        if (!existeCarro(placa)) {
            Caro nuevoCarro = new Caro(placa, horaEntrada);
            for (PuestoEstacionamiento puesto : puestosEstacionamiento) {
                if (!puesto.estaOcupado()) {
                    puesto.estacionarCarro(nuevoCarro);
                    carrosEstacionados.add(nuevoCarro);
                    System.out.println("Carro estacionado correctamente en el puesto " + puesto.getNumeroPuesto());
                    return;
                }
            }
            System.out.println("No hay puestos disponibles.");
        } else {
            System.out.println("El carro con placa " + placa + " ya está estacionado.");
        }
    }

    public void sacarCarro(String placa, int horaSalida) {
        if (existeCarro(placa)) {
            Caro carro = obtenerCarro(placa);
            double totalHoras = horaSalida - carro.getHoraEntrada();
            double precioTotal = totalHoras * tarifaPorHora;
            System.out.println("Carro con placa " + placa + " salió. Precio total: $" + precioTotal);
            ingresosTotales += precioTotal;

            for (PuestoEstacionamiento puesto : puestosEstacionamiento) {
                if (puesto.estaOcupado() && puesto.getCarroEstacionado().getPlaca().equals(placa)) {
                    puesto.sacarCarro();
                    carrosEstacionados.remove(carro);
                    return;
                }
            }
        } else {
            System.out.println("El carro con placa " + placa + " no está estacionado aquí.");
        }
    }

    public double calcularIngresosTotales() {
        return ingresosTotales;
    }

    public int obtenerPuestosDisponibles() {
        int puestosDisponibles = 0;
        for (PuestoEstacionamiento puesto : puestosEstacionamiento) {
            if (!puesto.estaOcupado()) {
                puestosDisponibles++;
            }
        }
        return puestosDisponibles;
    }

    public void cambiarTarifaPorHora(double nuevaTarifa) {
        this.tarifaPorHora = nuevaTarifa;
        System.out.println("Tarifa por hora cambiada a $" + nuevaTarifa);
    }

    private boolean existeCarro(String placa) {
        for (Caro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    private Caro obtenerCarro(String placa) {
        for (Caro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }
    private int calcularTiempo(int horaEntrada){
        int horaActual = obtenerHoraActual();
        int tiempo = horaActual - horaEntrada;
        return tiempo;
    }
    private int obtenerHoraActual(){
        return 14;
    }

    public double darTiempoPromedio() {
        double totalHoras = 0;
        int cantidadCarros = carrosEstacionados.size();

        for (Caro carro : carrosEstacionados) {
            totalHoras += calcularTiempo(carro.getHoraEntrada()); // Implementa la lógica para calcular el tiempo
        }

        return totalHoras / cantidadCarros;
    }

    public Caro carroConMasHoras() {
        Caro carroMaxHoras = null;
        int maxHoras = -1;

        for (Caro carro : carrosEstacionados) {
            int tiempoActual = calcularTiempo(carro.getHoraEntrada()); // Implementa la lógica para calcular el tiempo

            if (tiempoActual > maxHoras) {
                maxHoras = tiempoActual;
                carroMaxHoras = carro;
            }
        }
        return carroMaxHoras;
    }

    public boolean hayCarroMasDeOchoHoras() {
        for (Caro carro : carrosEstacionados) {
            int tiempoActual = calcularTiempo(carro.getHoraEntrada()); // Implementa la lógica para calcular el tiempo
            if (tiempoActual > 8) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Caro> darCarrosMasDeTresHorasParqueados() {
        ArrayList<Caro> carrosMasDeTresHoras = new ArrayList<>();

        for (Caro carro : carrosEstacionados) {
            int tiempoActual = calcularTiempo(carro.getHoraEntrada()); // Implementa la lógica para calcular el tiempo
            if (tiempoActual > 3) {
                carrosMasDeTresHoras.add(carro);
            }
        }

        return carrosMasDeTresHoras;
    }

    public boolean hayCarrosPlacaIgual() {
        ArrayList<String> placas = new ArrayList<>();
        for (Caro carro : carrosEstacionados) {
            String placa = carro.getPlaca();
            if (placas.contains(placa)) {
                return true;
            }
            placas.add(placa);
        }
        return false;
    }

    public int contarCarrosQueComienzanConPlacaPB() {
        int count = 0;
        for (Caro carro : carrosEstacionados) {
            if (carro.getPlaca().startsWith("PB")) {
                count++;
            }
        }
        return count;
    }

    public boolean hayCarroCon24Horas() {
        for (Caro carro : carrosEstacionados) {
            int tiempoActual = calcularTiempo(carro.getHoraEntrada()); // Implementa la lógica para calcular el tiempo
            if (tiempoActual >= 24) {
                return true;
            }
        }
        return false;
    }

    public String metodo1() {
        int carrosPB = contarCarrosQueComienzanConPlacaPB();
        boolean hayCarro24Horas = hayCarroCon24Horas();

        return "Cantidad de carros con placa PB: " + carrosPB + " - Hay carro parqueado por 24 o más horas: " + (hayCarro24Horas ? "Sí." : "No.");
    }

    public int desocuparParqueadero() {
        int carrosSacados = carrosEstacionados.size();
        carrosEstacionados.clear();
        return carrosSacados;
    }

    public String metodo2() {
        int carrosSacados = desocuparParqueadero();
        return "Cantidad de carros sacados: " + carrosSacados + ".";
    }
}

