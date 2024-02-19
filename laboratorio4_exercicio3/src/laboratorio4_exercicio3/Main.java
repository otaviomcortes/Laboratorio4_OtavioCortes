package laboratorio4_exercicio3;

public class Main {
    public static void main(String[] args) {
        Monitor monitorBasico = new MonitorBasico();

        MonitorHTML adaptadorHTML = new AdaptadorMonitorHTML(monitorBasico);
        adaptadorHTML.exibirHTML("<h1>Olá, mundo!</h1>");
    }
}