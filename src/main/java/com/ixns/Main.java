package com.ixns;

import com.ixns.domain.Person;
import com.ixns.filter.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Robert","Male", "Single"));
        people.add(new Person("John", "Male", "Married"));
        people.add(new Person("Laura", "Female", "Married"));
        people.add(new Person("Diana", "Female", "Single"));
        people.add(new Person("Mike", "Male", "Single"));
        people.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleAndMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Male:");
        printPeople(male.meetCriteria(people));

        System.out.println("\nFemale:");
        printPeople((female.meetCriteria(people)));

        System.out.println("\nSingle:");
        printPeople(single.meetCriteria(people));

        System.out.println("\nSingle and Male:");
        printPeople(singleAndMale.meetCriteria(people));

        System.out.println("\nSingle or Female");
        printPeople(singleOrFemale.meetCriteria(people));
    }

    public static void printPeople(List<Person> people) {
        for (Person person: people) {
            System.out.println(person);
        }
    }
}