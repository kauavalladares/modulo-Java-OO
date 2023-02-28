public class testabanco {
    public static void main(String[] args) {
        cliente kaua = new cliente();
        kaua.nome = "kaua valladares";
        kaua.cpf = "000-000-000-00";
        kaua.profissao =  "estagiario";

        conta contadokaua = new conta();
        contadokaua.deposita(100);

        // associa o cliente kaua a contadokaua
        contadokaua.titular = kaua;
        System.out.println(contadokaua.titular.nome);
        System.out.println(contadokaua.titular);
        System.out.println(kaua);

    }
}
