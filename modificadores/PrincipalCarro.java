public class PrincipalCarro {
    public static void main(String args[]) {

        Carro obj = new Carro();
        obj.setModelo("X1");
        obj.setPlaca("QWE 1234");
        Carro.entrouCarro();

        Carro obj2 = new Carro();
        obj2.setModelo("Tiguan");
        obj2.setPlaca("QWE 4321");
        System.out.println(obj.getInformacoes());
        System.out.println(obj2.getInformacoes());

    }
}