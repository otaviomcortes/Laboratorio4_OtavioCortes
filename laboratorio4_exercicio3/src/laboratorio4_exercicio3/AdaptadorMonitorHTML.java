package laboratorio4_exercicio3;

class AdaptadorMonitorHTML implements MonitorHTML {
    private final Monitor monitor;

    public AdaptadorMonitorHTML(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void exibirHTML(String conteudoHTML) {
        System.out.println("Convertendo conteúdo HTML para formato compatível com o monitor...");
        
        monitor.exibir();
    }
}