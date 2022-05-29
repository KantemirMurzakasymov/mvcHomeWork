package allpackages.repository;

import allpackages.models.Groupe;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupeRepository {

    private final EntityManager Manager;

    public GroupeRepository(EntityManager entityManager) {
        this.Manager = entityManager.getEntityManagerFactory().createEntityManager();
    }

    public void save(Groupe groupe){
        Manager.persist(groupe);
    }

    public Groupe findById(Long groupeId){
        return Manager.find(Groupe.class, groupeId);
    }

    public List<Groupe> findAll(){
        return Manager
                .createQuery("SELECT S FROM Groupe  s", Groupe.class)
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




