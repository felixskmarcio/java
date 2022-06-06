import java.util.Date;//importa a classe Date

//Classe Pessoa
public class Pessoa {// classe Pessoa
    public String nome;// atributo nome da classe Pessoa
    public String cpf;// atributo cpf da classe Pessoa
    public Date data_nascimento;// atributo data_nascimento da classe Pessoa

    //construtor da classe Pessoa
    public Pessoa(String_nome, String_cpf, Date_data) {// classe Pessoa com os atributos nome, cpf e data_nascimento
        this.nome =_nome;// atributo nome recebe o valor do parâmetro _nome
        this.cpf =_cpf;// atributo cpf recebe o valor do parâmetro _cpf
        this.data_nascimento =_data;// atributo data_nascimento recebe o valor do parâmetro _data
    }//fim do construtor

    //método para imprimir os dados da classe Pessoa
    public double tirarCopias(int qtd) {// método tirarCopias da classe Pessoa
        return 0.10 * (double) qtd;// retorna o valor da quantidade de copias
    }//fim do método tirarCopias
}//fim do classe Pessoa

//construtor da classe Pessoa   
public class Aluno extends Pessoa {// classe Aluno que herda os atributos da classe Pessoa
    public Aluno(String_nome, String_cpf, Date_data) {// classe Pessoa com os atributos nome, cpf e data_nascimento
        super(_nome,_cpf,_data);// chama o construtor da classe Pessoa
    }//fim do construtor

    public String matricula;// atributo matricula da classe Pessoa

    public double tirarCopias(int qtd) {// classes Aluno que herda os atributos da classe Pessoa
        return 0.07 * (double) qtd;// retorna o valor da quantidade de copias
    }//fim do método tirarCopias
}//fim do classe Aluno


/*
OBS
Public está na função de modificador de acesso, ou seja, terá a função de determinar a visibilidade de um método ou atributo pertencente a uma classe.
Class ou classe tem como objetivo representar objetos do mundo real, no exemplo acima está representando “pessoa” 
Atributos ela será uma propriedade de um objeto, no código mostrando os atributos são “public string nome”, “public string cpf”, “public date data_nascimento”.
Implementação nesse caso “public Pessoa (String_nome, String_cpf, Date_data) é um tipo de implementação.
Métodos são equivalentes a uma função, ação de execução ou procedimento. “tirarCopias (int qtd)”
Herança faz um reuso e reaproveitamento de código existente, ou seja, permite que sejam criadas novas classes a partir de classes já existentes. “extends” 
*/
