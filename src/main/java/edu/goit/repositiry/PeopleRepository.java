package edu.goit.repositiry;

import edu.goit.entity.People;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PeopleRepository {

    public People findById(Long id) {
        return People.builder()
                .age((byte) 23)
                .lastName("Tompson")
                .firstNAme("John")
                .birthday(LocalDate.MIN).build();
    }

}
