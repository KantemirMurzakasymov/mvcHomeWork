package allpackages.controller;

import allpackages.models.Company;
import allpackages.services.GroupeService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GroupeController {

    private final GroupeService groupeRepositoryService;


    public GroupeController(GroupeService groupeRepositoryService) {
        this.groupeRepositoryService = groupeRepositoryService;
    }

    public void save(Company company){
        groupeRepositoryService.save();
    }

    public Company findById(Long companyId){
        return groupeRepositoryService.findById();
    }

    public List<Company> findAll(){
        return groupeRepositoryService.findAll();

    }
    public void deleteById(Long companyId){
        groupeRepositoryService.deleteById();

    }




}
