package allpackages.services;

import allpackages.models.Teacher;
import allpackages.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void save() {
    }

    public Teacher findById() {
        return null;
    }

    public List<Teacher> findAll() {
        
        return teacherRepository.findAll();
    }

    public void deleteById() {
    }
}
