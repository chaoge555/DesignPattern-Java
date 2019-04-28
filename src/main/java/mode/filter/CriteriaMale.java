package mode.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> list = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("male")) {
                list.add(person);
            }
        }
        return list;
    }
}
