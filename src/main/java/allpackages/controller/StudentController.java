package allpackages.controller;

import allpackages.models.Company;
import allpackages.services.StudentService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentRepositoryService;

    public StudentController(StudentService studentRepositoryService) {
        this.studentRepositoryService = studentRepositoryService;
    }

    public void save(Company company){
        studentRepositoryService.save();
    }

    public Company findById(Long companyId){
        return studentRepositoryService.findById();
    }

    public List<Company> findAll(){
        return studentRepositoryService.findAll();

    }
    public void deleteById(Long companyId){
        studentRepositoryService.deleteById();

    }




}
