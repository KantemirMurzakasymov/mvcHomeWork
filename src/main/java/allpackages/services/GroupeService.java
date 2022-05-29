package allpackages.services;

import allpackages.models.Company;
import allpackages.repository.GroupeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {

    private final GroupeRepository groupeRepository;

    public GroupeService(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
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
