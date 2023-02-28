public class testedeReferencia {

    public static void main(String[] args) {
              //referencia
        conta primeiraconta = new conta();
        primeiraconta.saldo = 300;

        System.out.println("saldo da primeira conta: " + primeiraconta.saldo);

        conta segundaConta = primeiraconta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo +=100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        if (primeiraconta == segundaConta) {
            System.out.println("são a mesma coisa! ");
        }

    }
}
