package com.ixns.filter;

import com.ixns.domain.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> people);
}
