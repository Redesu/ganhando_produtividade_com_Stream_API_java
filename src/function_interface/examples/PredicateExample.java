package function_interface.examples;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate é usada para representar uma função que recebe 
 * um argumento e retorna um valor booleano, indicando se 
 * a condição especificada é verdadeira ou falsa para o argumento.
 */

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "javascript", "Python");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
    }
    
}
