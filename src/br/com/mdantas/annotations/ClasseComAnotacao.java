package br.com.mdantas.annotations;

/**
 * @author marcelo.dantas
 */

@PrimeiraAnotacao(value =  "Mahaw", bairros = {"teste", "teste1"}, numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value =  "Mahaw", bairros = "teste2", numeroCasa = 20, valores = 100d)
    private String nome;
}
