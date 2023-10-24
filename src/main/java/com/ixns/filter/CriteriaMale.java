package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> malePeople = new ArrayList<>();
        for (Person person: people) {
            if(person.gender().equalsIgnoreCase("MALE")) {
                malePeople.add(person);
            }
        }
        return malePeople;
    }
}
