package function_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/** 
 * Consumer é frequentemente usada para representar uma 
 * operação que consome (ou seja, recebe como entrada) 
 * um argumento, mas não retorna nenhum resultado. Ela 
 * é amplamente utilizada em operações de processamento 
 * de dados em coleções ou streams.
*/

public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumeroPar);

    }
}
