package allpackages.services;

import allpackages.models.Company;
import allpackages.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
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
