package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> singlePeople = new ArrayList<>();
        for (Person person: people) {
            if(person.maritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePeople.add(person);
            }
        }
        return singlePeople;
    }
}
