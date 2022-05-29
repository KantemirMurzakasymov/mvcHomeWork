package allpackages.controller;

import allpackages.models.Company;
import allpackages.services.CourseService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {

    private final CourseService courseRepositoryService;


    public CourseController(CourseService courseRepositoryService) {
        this.courseRepositoryService = courseRepositoryService;
    }

    public void save(Company company){
        courseRepositoryService.save();
    }

    public Company findById(Long companyId){
        return courseRepositoryService.findById();
    }

    public List<Company> findAll(){
        return courseRepositoryService.findAll();

    }
    public void deleteById(Long companyId){
        courseRepositoryService.deleteById();

    }


}
