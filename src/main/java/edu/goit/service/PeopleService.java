package edu.goit.service;

import edu.goit.entity.People;
import edu.goit.repositiry.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;


    public Integer calculateAge(Long id) {
        People people = peopleRepository.findById(1L);
        return LocalDate.now().getYear() - people.getBirthday().getYear();
    }


}
