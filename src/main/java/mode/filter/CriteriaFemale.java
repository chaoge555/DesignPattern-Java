package mode.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> list = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("female")) {
                list.add(person);
            }
        }
        return list;
    }
}
