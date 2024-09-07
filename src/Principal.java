public class Principal {
    public static void main(String[] args) throws Exception {
        // ContaCorrente cc =new ContaCorrente();tambemfuncionaria

        Cliente cli1 = new Cliente();
        cli1.setNome("Michael");

        Conta cc = new ContaCorrente(cli1);
        Conta cp = new ContaPolpanca(cli1);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(100, cp);

        cp.imprimirExtrato();
    }
}
