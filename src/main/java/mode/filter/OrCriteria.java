package mode.filter;

import java.util.List;

public class OrCriteria implements Criteria {
    Criteria criteria;
    Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> personListOne = criteria.meetCriteria(personList);
        List<Person> personListTwo = otherCriteria.meetCriteria(personList);
        for (Person person:personListTwo){
           if(!personListOne.contains(person)){
               personListOne.add(person);
           }
        }
        return personListOne;
    }
}
