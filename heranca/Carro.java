public class Carro extends Veiculo {
    private int numeroPorta;

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public int getNumeroPorta() {
        return this.numeroPorta;
    }

    @Override
    public void andarFrente() {
        System.out.println("Andando como carro");
    }

    @Override
    public String toString() {
        return "Carro de " + numeroPorta;
    }

    @Override
    public boolean equals(Object obj) {

    }
}