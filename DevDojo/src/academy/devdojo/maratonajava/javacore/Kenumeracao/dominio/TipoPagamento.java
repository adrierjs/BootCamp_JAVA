package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularPagamento(double valor) {
            return valor * 0.10;
        }
    }, CREDITO{
        @Override
        public double calcularPagamento(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularPagamento(double valor); //o método não existe, mas ele irá ser utilizado em algum lcoal da classe, exemplo: DEBITO e CREDITO.


}
