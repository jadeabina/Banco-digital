public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();

        cc.depositar(100);

        Conta poupaca = new ContaPoupaca();

        cc.transferir(100,poupaca);

        cc.imprimirExtrato();
        poupaca.imprimirExtrato();

    }

}
