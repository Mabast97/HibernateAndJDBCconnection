package teacher;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;

    @Column(name = "first_name")
    private String fName;

    @Column(name = "last_name")
    private String lName;

    @Column(name = "age")
    private int age;

    public Teacher () {   }

    public Teacher(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

}
