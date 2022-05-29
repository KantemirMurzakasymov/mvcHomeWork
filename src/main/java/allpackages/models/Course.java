package allpackages.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String courseName;
    private String durationMounth;

    @ManyToMany
    private List < Groupe > groupes = new ArrayList<>();

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDurationMounth() {
        return durationMounth;
    }

    public void setDurationMounth(String durationMounth) {
        this.durationMounth = durationMounth;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", durationMounth='" + durationMounth + '\'' +
                '}';
    }
}
