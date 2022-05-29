package allpackages.controller;

import allpackages.models.Company;
import allpackages.services.CompanyService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompanyController {

    private  final CompanyService companyRepositoryService;


    public CompanyController(CompanyService companyRepositoryService) {
        this.companyRepositoryService = companyRepositoryService;
    }

    public void save(Company company){
        companyRepositoryService.save();
    }

    public Company findById(Long companyId){
        return companyRepositoryService.findById();
    }

    public List<Company> findAll(){
        return companyRepositoryService.findAll();

    }
    public void deleteById(Long companyId){
        companyRepositoryService.deleteById();

    }

}
