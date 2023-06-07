package edu.goit.controller;

import edu.goit.entity.People;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class PeopleController {

    public People getPeople(Long id){
        return People.builder()
                .age((byte) 23)
                .lastName("Tompson")
                .firstNAme("John")
                .birthday(LocalDate.MIN).build();
    }

}
