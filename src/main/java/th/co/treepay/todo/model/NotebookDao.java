/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.treepay.todo.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author darongpon
 */
@Repository
public class NotebookDao {
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Notebook notebook) {
        entityManager.persist(notebook);
    }
    
    public void update(Notebook notebook) {
        entityManager.merge(notebook);
    }

    public Notebook getNotebookById(long id) {
        return entityManager.find(Notebook.class, id);
    }

    public List<Notebook> getAllNotebookRecords() {
        Query query = entityManager.createQuery("SELECT e FROM Notebook e");
        return query.getResultList();
    }

    public void delete(long id) {
        Notebook apiRequest = getNotebookById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }

    public void deleteAllNotebookRecords() {
        Query query = entityManager.createQuery("DELETW FROM Notebook");
        query.executeUpdate();
    }
}
