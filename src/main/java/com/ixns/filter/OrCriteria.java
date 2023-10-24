package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria firstCriteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria otherCriteria) {
        this.firstCriteria = firstCriteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> orCriteriaPeople = firstCriteria.meetCriteria(people);
        List<Person> otherCriteriaPeople = otherCriteria.meetCriteria(people);
        for(Person person: otherCriteriaPeople) {
            if (!orCriteriaPeople.contains(person)) {
                orCriteriaPeople.add(person);
            }
        }
        return orCriteriaPeople;
    }
}
