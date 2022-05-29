package allpackages.controller;

import allpackages.models.Company;
import allpackages.models.Teacher;
import allpackages.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherRepositoryService;

    public TeacherController(TeacherService teacherRepositoryService) {
        this.teacherRepositoryService = teacherRepositoryService;
    }

    public void save(Company company){
        teacherRepositoryService.save();
    }

    public Teacher findById(Long companyId){
        return teacherRepositoryService.findById();
    }

    @ModelAttribute(name="teacherList")
    public List<Teacher> findAll(){
        return teacherRepositoryService.findAll();

    }

    @GetMapping
    public String findAl(){
        return "allTeachers";
    }
    @GetMapping("/save")
    public String saveAll(Model model){
        return "saveAll";
    }

    public void deleteById(Long companyId){
        teacherRepositoryService.deleteById();

    }
}
