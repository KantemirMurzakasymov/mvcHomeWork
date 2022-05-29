package allpackages.services;

import allpackages.models.Company;
import allpackages.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
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
