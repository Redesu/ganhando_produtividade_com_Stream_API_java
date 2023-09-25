package function_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Ela representa uma função que aceita um 
 * argumento de entrada e produz um resultado
 */

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        numerosDobrados.forEach(System.out::println);
        
    }
}
