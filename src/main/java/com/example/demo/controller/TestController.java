package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.repo.TestRepo;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person){
        return testService.savePerson(person);
    }
    
    @GetMapping("/all")
    public List<Person> getAll(){
        return testService.getAll();
    }

    @GetMapping
    public String getString() {
        return "Hi";
    }
}
