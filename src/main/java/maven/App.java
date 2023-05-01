package maven;

import maven.person.Person;
import maven.person.PersonSerializerImp;

public class App {
    public static void main( String[] args ) {
        PersonSerializerImp personSerializer = new PersonSerializerImp(
                new Person("Stanislav", "Ivanov")
        );
        personSerializer.printPerson();
    }
}
