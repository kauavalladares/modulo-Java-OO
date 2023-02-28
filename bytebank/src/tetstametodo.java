public class tetstametodo {
    public static void main(String[] args) {
        conta contadokaua = new conta();
        contadokaua.saldo = 100;
        contadokaua.deposita(50);
        System.out.println(contadokaua.saldo);

        boolean conseguiuretirar = contadokaua.saca(20);
        System.out.println(contadokaua.saldo);
        System.out.println(conseguiuretirar);

        conta contadamarcela = new conta();
        contadamarcela.deposita(1000);

        if (contadamarcela.transfere(3000,contadokaua)){
            System.out.println("transferencia comcluida com sucesso!");
        }else {
            System.out.println("tranferencia não comcluida");
        }

        System.out.println(contadamarcela.saldo);
        System.out.println(contadokaua.saldo);

        contadokaua.titular = "kauã valladares";
        System.out.println(contadokaua.titular);
    }
}
