package Array.LAB1;

import java.util.ArrayList;
import java.util.List;

public class VD4 {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Per1");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);




        programmingLanguages.remove(5);
        System.out.println("After remove(5):  "+ programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"): " + programmingLanguages;

        
    }
}
