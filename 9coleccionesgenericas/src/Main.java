import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        Object[] arrays = new Object[5];
        arrays[0] = "Hola";
        arrays[1] = 1.0;

        List<Object> list = new ArrayList<>();
        list.add("Hola");
        list.add(1.4);
        list.add('a');
        list.add(true);

        Person[] persons = new Person[5];
        persons[0] = new Student();
        persons[1] = new Student();
        persons[2] = new Teacher();

        List<Person> listPersons = new ArrayList<>();
        listPersons.add(new Student());
        listPersons.add(new Teacher());

    }
}
