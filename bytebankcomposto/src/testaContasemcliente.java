public class testaContasemcliente {
    public static void main(String[] args) {
        conta contadamarcela = new conta();
        System.out.println(contadamarcela.getSaldo());

        contadamarcela.titular = new cliente();
        System.out.println(contadamarcela.titular);


        contadamarcela.titular.nome = "marcela";
        System.out.println(contadamarcela.titular.nome);
    }
}
