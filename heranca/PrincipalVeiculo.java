public class PrincipalVeiculo {
    public static void main(String args[]) {
        Veiculo veiculo = new Aviao();

        estacionarVeiculo(veiculo);

    }

    public static void estacionarVeiculo(Veiculo veiculo) {
        if (veiculo instanceof Aviao) {
            System.out.println("Iniciando o estacionamento do carro");
        } else {
            System.out.println("Iniciando o estacionamento do avião");
        }

        veiculo.andarFrente();
        veiculo.andarFrente();
        veiculo.buzinar();
        System.out.println("Finalizando o estacionamento");
    }
}
