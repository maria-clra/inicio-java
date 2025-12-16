public class Carro {

    private String modelo;

    private int qntPorta;

    private String placa;

    private String motor;

    private static final String MARCA = "BMW";

    public static void entrouCarro() {
        System.out.println("Entrou no carro");
    }

    public String getInformacoes() {
        return "Marca: " + MARCA + " modelo: " + modelo + " placa: " + placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntPorta() {
        return qntPorta;
    }

    public void setQntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    private boolean estaAcelerando = false;

    public void acelerar() {
        estaAcelerando = true;
        if (motor == null) {
            this.setMotor("Motor 1.0");
        }
        System.out.println("Acelerando com motor: " + motor);
    }

    public void parar() {
        this.ligarLuzFreio();
        this.desacelerar();
        System.out.println("Carro parado");
    }

    private void desacelerar() {
        if (estaAcelerando == true) {
            System.out.println("Desacelerando...");
        }
        estaAcelerando = false;
    }

    private void ligarLuzFreio() {
        System.out.println("Ligando luz de freio...");
    }

}
