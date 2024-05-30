package br.com.mdantas.exceptions;

/**
 * @author marcelo.dantas
 */
public class ExemplosExceptions {

    public static void main(String[] args) {
        //semTratamentoException();
        //comTratamentoException();
        //comTratamentoExceptionComFinally();
        lancarRuntimeException();
        System.out.println("Teste");
    }

    private static void lancarRuntimeException() {
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoException() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch(NullPointerException e) {
            //TRATAMENTO DA Exceção
            System.out.println("A frase inicial está nula, para solucionar tal problema, foi lhe atribuido um valor padrão");
            frase = "Frase vazia";
            novaFrase =  frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void comTratamentoExceptionComFinally() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch(NullPointerException e) {
            //TRATAMENTO DA Exceção
            System.out.println("A frase inicial está nula, para solucionar tal problema, foi lhe atribuido um valor padrão");
            frase = "Frase vazia";
        } finally {
            novaFrase =  frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void semTratamentoException() {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
