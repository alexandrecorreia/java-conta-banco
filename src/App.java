public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Alexandre Luiz");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
