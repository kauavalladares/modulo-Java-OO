public class testeSacaNegativo {
    public static void main(String[] args) {
        conta conta = new conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);


        //proibido:
        //conta.saldo = conta.saldo - 101;
        System.out.println(conta.getSaldo());
    }
}
