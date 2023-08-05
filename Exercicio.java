// Exercicio.java
public class Exercicio {
    String nome;
    int repeticoes;
    int series;
    int carga;

    public Exercicio(String nome, int repeticoes, int series, int carga) {
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.series = series;
        this.carga = carga;
    }

    public void exibirInfo() {
        System.out.println("Exercício: " + nome);
        System.out.println("Repetições: " + repeticoes);
        System.out.println("Séries: " + series);
        System.out.println("Carga: " + carga + " kg");
    }
}




/*

A classe "Exercicio" agora representa apenas um exercício de musculação.
Simplificamos os atributos para "nome", "repeticoes", "series" e "carga".
No programa principal (classe "Main"), criamos um objeto "Exercicio" chamado "agachamento" com os valores especificados no construtor.
Em seguida, exibimos as informações do exercício utilizando o método "exibirInfo()" da classe "Exercicio".
Agora o exemplo está mais simples, mas ainda ilustra os conceitos de POO, como criação de classes, atributos, 
métodos e uso de objetos para representar entidades do mundo real. 

*/