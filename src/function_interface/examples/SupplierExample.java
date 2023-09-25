package function_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Supplier  é usada para representar 
 * uma operação que fornece (ou seja, gera) 
 * um valor, sem receber qualquer argumento.
 */

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> helloWorld = () -> "Hello world!";

        List<String> helloList = Stream.generate(helloWorld)
                .limit(5)
                .collect(Collectors.toList());

        helloList.forEach(System.out::println);
    }

}
