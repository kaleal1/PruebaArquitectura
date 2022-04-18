package com.example.ejemplo.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table()
@Getter @Setter

public class Student {

    @Id
    @GeneratedValue //el id sera autoincremental
    private Long id;
    private String name;
    private String lastname;
//    @ManyToMany
//    @JoinTable(
//            name = "STUDENTS_SUBJECTS",
//            joinColumns = @JoinColumn(name= "STUDENTS_ID"),
//            inverseJoinColumns = @JoinColumn(name = "SUBJECTS_")
//    )


}
