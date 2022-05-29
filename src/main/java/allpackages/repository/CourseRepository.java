package allpackages.repository;

import allpackages.models.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseRepository {

    private final EntityManager Manager;

    public CourseRepository(EntityManager entityManager) {
        this.Manager = entityManager.getEntityManagerFactory().createEntityManager();
    }

    public void save(Course course){
        Manager.persist(course);
    }

    public Course findById(Long courseId){
        return Manager.find(Course.class, courseId);
    }

    public List<Course> findAll(){
        return Manager
                .createQuery("SELECT S FROM Groupe  s", Course.class)
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
