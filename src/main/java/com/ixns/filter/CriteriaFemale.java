package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> femalePeople = new ArrayList<>();
        for (Person person: people) {
            if(person.gender().equalsIgnoreCase("FEMALE")) {
                femalePeople.add(person);
            }
        }
        return femalePeople;
    }
}
