public class conta {

    // define um atributo como privado, onde so pode ser acessado por meio de metodos.
    private double saldo;
    private int agencia;
    private int numero;
    private cliente titular;
    private static int total;

    public conta(int agencia,int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta"+this.numero);
    }

    public void deposita(double valor) {

        this.saldo = this.saldo + valor;

    }


    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    public boolean transfere(double valor, conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setnumero(int novoNumero) {
        if (numero <= 0){
            System.out.println("Erro: não pode valor menor ou igual a zero!");
            return;
        }
        this.numero = novoNumero;
    }

    public void getAgencia() {
           this.agencia = agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
            this.agencia = agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return titular;
    }
    public static int getTotal() {
        return total;
    }
}
