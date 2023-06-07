package edu.goit.service;

import edu.goit.repositiry.PeopleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PeopleService {
    private PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public Integer calculateAge(Long id){

        return LocalDate.now().getYear() - getPeople().getBirthday().getYear();
    }



}
