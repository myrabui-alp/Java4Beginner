import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args){
        List<String> list = List.of("Apple", "Bat", "Cat",
                "Dog");
        printWithFPWithFiltering(list);
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println("element" + element));
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println("element - " +element));
    }
}
