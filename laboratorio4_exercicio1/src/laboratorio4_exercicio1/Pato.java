package laboratorio4_exercicio1;

class Pato implements Ave {
    @Override
    public void voar() {
        System.out.println("Pato voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Pato grasnando");
    }
}
