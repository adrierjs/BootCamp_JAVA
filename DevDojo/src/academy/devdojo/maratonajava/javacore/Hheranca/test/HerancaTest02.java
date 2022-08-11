package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
//    0 - Bloco de inicialização estático da super classe(Pessoa) é executado quando a JVM carregar a classe filha
//    1 - Bloco de inicilização estático da sub classe(Funcionario) é executado quando a JVM carregar a classe filho
//    2 - Alocando o espaço da memória para o objeto da superclasse(Pessoa)
//    3 - Cada atributo da superclasse(Pessoa) é criado e inicializado com valores default ou o que foi passado
//    4 - Bloco de inicialização é executado da superclasse(Pessoa)
//    5 - Construtor é executado da superclasse(Pessoa)
//    6 - Alocado espaço da memória para o objeto da subclasse(Funcionario)
//    7 - Cada atributo da subclasse(Funcionario) é criado e inicializado com valores default ou o que foi passado
//    8 - Bloco de inicializacao da subclasse é executado
//    9 - O construtor da subclasse é executado

//    Resumindo, o bloco estático é inicializado respeitado a ordem: pai-filho.
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Adrier");
    }
}
