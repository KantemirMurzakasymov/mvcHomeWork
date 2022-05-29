package allpackages.repository;

import allpackages.models.Company;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CompanyRepository {

    private final EntityManager Manager;

    public CompanyRepository(EntityManager entityManager) {
        this.Manager = entityManager.getEntityManagerFactory().createEntityManager();
    }

    public void save(Company company){
        Manager.persist(company);
    }

    public Company findById(Long companyId){
        return Manager.find(Company.class, companyId);
    }

    public List<Company> findAll(){
        return Manager
                .createQuery("SELECT S FROM Groupe  s", Company.class)
                .getResultList();
    }
    public void deleteById(Long companyId){
        Manager.createQuery("DELETE FROM Company c WHERE c.id=?1")
                .setParameter(1, companyId)
                .executeUpdate();

    }

    //    public void deleteById(Groupe groupeId){
//        Manager.remove(Manager.find(Groupe.class, groupeId));
//
//    }


}
