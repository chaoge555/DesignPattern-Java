package mode.filter;

import java.util.List;

public class AndCriteria implements Criteria {
    Criteria criteria;
    Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> list = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(list);
    }
}
