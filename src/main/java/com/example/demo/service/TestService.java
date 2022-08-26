package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    public Person savePerson(@RequestBody Person person){
        return testRepo.save(person);
    }

    public List<Person> getAll(){
        return testRepo.findAll();
    }
}
