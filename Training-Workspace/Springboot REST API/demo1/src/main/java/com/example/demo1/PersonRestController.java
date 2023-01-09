package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonRestController {

    private static List<Person> persons = new ArrayList<>();

    @GetMapping("/home")
    public String homePage() {
        return "This Is My Home Page!";
    }

    static {
        Person p = new Person();
        p.setName("Mayur Pai");
        p.setPrivateID(005);
        p.setSalary(1000000);
        p.setSalaryPaid(true);
        persons.add(p);
    }

    @GetMapping("/persons")
    public List<Person> listAllPersons() {
        return persons;
    }

    @PostMapping("/persons")
    public Person savePersons(@RequestBody Person person) {
        persons.add(person);
        return person;
    }

    @PutMapping("/persons")
    public Person updatePersons(@RequestBody Person person) {
        persons.add(person);
        return person;
    }

    @DeleteMapping("/persons")
    public Person deletePersons(@RequestBody Person person) {
        persons.remove(person);
        return person;
    }
}
