public class Aviao extends Veiculo implements Voo {

    @Override
    public void voar() {
        System.out.println("Voando como avião");
    }

    @Override
    public void andarFrente() {
        System.out.println("Andando como avião");
    }

}