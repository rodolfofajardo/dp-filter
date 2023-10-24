package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria firstCriteria;
    private final Criteria otherCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria otherCriteria) {
        this.firstCriteria = firstCriteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> firstCriteriaPeople = firstCriteria.meetCriteria(people);
        return otherCriteria.meetCriteria(firstCriteriaPeople);
    }
}
