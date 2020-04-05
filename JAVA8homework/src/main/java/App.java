import entity.MasterNumber;

import java.util.Arrays;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        //TODO: print Person data that masterNumber is 1 and 2
        System.out.println("----Person data that masterNumber is 1 and 2----");
        personService.getPersonByMasterNumbers(Arrays
                .asList(new MasterNumber("1"), new MasterNumber("2"))).forEach(System.out::println);
        // print Person data that masterNumber is 3
        System.out.println("----Person data that masterNumber is 3----");
        personService.getPersonByMasterNumbers(Collections
                .singletonList(new MasterNumber("3"))).forEach(System.out::println);
    }

}
