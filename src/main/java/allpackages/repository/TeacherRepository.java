package allpackages.repository;

import allpackages.models.Teacher;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TeacherRepository {

    private final EntityManager Manager;

    public TeacherRepository(EntityManager entityManager) {
        this.Manager = entityManager.getEntityManagerFactory().createEntityManager();
    }

    public void save(Teacher teacher){
        Manager.persist(teacher);
    }

    public Teacher findById(Long teacherId){
        return Manager.find(Teacher.class, teacherId);
    }

    public List<Teacher> findAll(){
        return Manager
                .createQuery("SELECT S FROM Groupe  s", Teacher.class)
                .getResultList();
    }

    public void deleteById(Long companyId){
        Manager.createQuery("DELETE FROM Company c WHERE c.id=?1")
                .setParameter(1, companyId)
                .executeUpdate();

    }

//    public void deleteById(Teacher teacherId){
//        Manager.remove(Manager.find(Teacher.class, teacherId));
//
//    }

}
