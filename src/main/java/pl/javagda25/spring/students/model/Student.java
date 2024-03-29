package pl.javagda25.spring.students.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity // to jest encja bazodanowa
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surName;
    private int age; //not null
    private boolean alive; //not null

    public Student(String name, String surName, int age, boolean alive) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.alive = alive;
    }

    public Student(Long id, String name, String surName, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.alive = alive;
    }


//    @Formula(value = "(SELECT AVG(g.value) from grade g where g.student_id = id)")
//    private Double average; //nullable - nie ma "not null" nie jest typem prostym dlatego moze przyjac null
//
//    @EqualsAndHashCode.Exclude
//    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @Cascade(value = {org.hibernate.annotations.CascadeType.REMOVE})
//    private Set<Grade> gradeList;
}
