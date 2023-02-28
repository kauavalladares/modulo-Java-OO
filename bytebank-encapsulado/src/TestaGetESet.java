public class TestaGetESet {
    public static void main(String[] args) {
        conta conta = new conta(1377,23123);
        //conta.numero = 1337;
        System.out.println(conta.getNumero());

        cliente kaua =new cliente();

        kaua.setNome("kaua valladares");

        conta.setTitular(kaua);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("estagiario");

    }
}
