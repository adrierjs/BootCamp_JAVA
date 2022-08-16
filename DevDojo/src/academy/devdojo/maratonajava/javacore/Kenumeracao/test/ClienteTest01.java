package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Adrier", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("José",TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Antonio",TipoCliente.PESSOA_PUBLICA);
        System.out.println(cliente.toString());
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calcularPagamento(100));


    }

}


