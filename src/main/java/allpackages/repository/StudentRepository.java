package allpackages.repository;

import allpackages.models.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentRepository {

    private final EntityManager Manager;

    public StudentRepository(EntityManager entityManager) {
        this.Manager = entityManager.getEntityManagerFactory().createEntityManager();
    }

    public void save(Student student){
        Manager.persist(student);
    }

    public Student findById(Long studentId){
        return Manager.find(Student.class, studentId);
    }

    public List<Student> findAll(){
        return Manager
                .createQuery("SELECT S FROM Groupe  s", Student.class)
                .getResultList();
    }

    public void deleteById(Long companyId){
        Manager.createQuery("DELETE FROM Company c WHERE c.id=?1")
                .setParameter(1, companyId)
                .executeUpdate();

    }

//    public void deleteById(Student studentId){
//        Manager.remove(Manager.find(Student.class, studentId));
//
//    }


}
