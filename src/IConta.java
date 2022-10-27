
//  interface é uma classe abistrata com todos os metodos abstratos(classe que obriga que todas as outras classes que
//  extende ela, inplementar tudo que ela tem )
public interface IConta {
    //metodos da interface de uso
    void sacar( double valor);

    void depositar(double valor);

    void transferir(double valor,Conta contaDestino );

    void imprimirExtrato();
}
