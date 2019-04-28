package mode.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        System.out.println("用CriteriaMale过滤器只想留下男性: ");
        printPersons(male.meetCriteria(persons));

        Criteria female = new CriteriaFemale();
        System.out.println("\n用CriteriaFemale过滤器只想留下女性:");
        printPersons(female.meetCriteria(persons));

        Criteria single = new CriteriaSingle();
        System.out.println("\n用CriteriaSingle过滤器只想留下单身:");
        printPersons(single.meetCriteria(persons));

        Criteria singleMale = new AndCriteria(single, male);
        System.out.println("\n用AndCriteria过滤器只想留下单身男性:");
        printPersons(singleMale.meetCriteria(persons));

        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("\n用OrCriteria过滤器想留下单身的或者女性:");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}

