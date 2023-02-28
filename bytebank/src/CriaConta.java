public class CriaConta {
    public static void main(String[] args) {

    conta primeiraconta = new conta();
     primeiraconta.saldo = 200;
     System.out.println(primeiraconta.saldo);

     primeiraconta.saldo += 100;
     System.out.println(primeiraconta.saldo);

     conta segundaconta= new conta();
     segundaconta.saldo = 50;

     // "intancias diferentes" cada conta e diferente, diferentes objetos mas no momento com os mesmos atributos.
     System.out.println("primeira conta tem " + primeiraconta.saldo);
         System.out.println("segunda conta tem " + segundaconta.saldo);
                System.out.println(primeiraconta.agencia);
                    System.out.println(segundaconta.agencia);


        if (primeiraconta == segundaconta) {
            System.out.println("são a mesma coisa!");

        } else {
            System.out.println("não são a mesma  coisa");
        }

        System.out.println(primeiraconta);
        System.out.println(segundaconta);



    }
}
