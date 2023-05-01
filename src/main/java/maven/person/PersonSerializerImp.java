package maven.person;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonSerializerImp implements PersonSerializer {
    private final Person person;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(person, Person.class);
    }

    @Override
    public void printPerson() {
        System.out.println(toJson());
    }
}
