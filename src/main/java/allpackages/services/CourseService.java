package allpackages.services;

import allpackages.models.Company;
import allpackages.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void save() {
    }

    public Company findById() {

        return null;
    }

    public List<Company> findAll() {

        return null;
    }

    public void deleteById() {
    }
}
