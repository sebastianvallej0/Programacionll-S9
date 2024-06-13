public class Caro {
    private String placa;
    private int horaEntrada;

    public Caro(String placa, int horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
