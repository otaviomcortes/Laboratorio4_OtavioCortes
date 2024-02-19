package laboratorio4_exercicio1;

class PavaoAdapter implements Ave {
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    public void voar() {
        // Pavao não pode voar, apenas exibe uma mensagem
        System.out.println("Pavao não pode voar");
    }

    public void emitirSom() {
        // Utiliza o método cantar do Pavao para emitir som
        pavao.cantar();
    }
}