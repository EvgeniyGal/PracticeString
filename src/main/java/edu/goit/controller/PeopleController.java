package edu.goit.controller;

import edu.goit.entity.People;
import edu.goit.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RequiredArgsConstructor
@RestController
public class PeopleController {

    private final PeopleService peopleService;

//    @GetMapping("/age")
//    public Integer calculateAge(@RequestParam("id") Long id){
//        return peopleService.calculateAge(id);
//    }

    @GetMapping("/age/{id}")
    public Integer calculateAge(@PathVariable("id") Long id){
        return peopleService.calculateAge(id);
    }

    @PutMapping("/age")
    public void setAge(){

    }



}
