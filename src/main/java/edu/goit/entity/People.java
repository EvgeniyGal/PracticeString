package edu.goit.entity;

import lombok.*;

import java.io.Serial;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class People implements BaseEntity<Long> {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String lastName;
    private String firstNAme;
    private byte age;
    private LocalDate birthday;
    private boolean isMarried;


}
