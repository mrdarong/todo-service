/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.treepay.todo.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.treepay.todo.model.Notebook;
import th.co.treepay.todo.model.NotebookDao;

/**
 *
 * @author darongpon
 */
@Service
@Transactional
public class TodoService {

    @Autowired
    private NotebookDao notebookDao;

    public void create(Notebook notebook) {
        notebookDao.create(notebook);
    }

    public void update(Notebook notebook) {
        notebookDao.update(notebook);
    }

    public Notebook getNotebookById(long id) {
        return notebookDao.getNotebookById(id);
    }

    public List<Notebook> getAllNotebookRecords() {
        return notebookDao.getAllNotebookRecords();
    }

    public void deleteAllNotebookRecords() {
        notebookDao.deleteAllNotebookRecords();
    }

    public void delete(long id) {
        notebookDao.delete(id);
    }

//    public void create(Notebook notebook) {
//        System.out.println("create");
//    }
//
//    public void update(Notebook notebook) {
//        System.out.println("create");
//    }
//
//    public Notebook getNotebookById(long id) {
//        return new Notebook();
//    }
//
//    public List<Notebook> getAllNotebookRecords() {
//        return new ArrayList<Notebook>();
//    }
//
//    public void deleteAllNotebookRecords() {
//        System.out.println("delete");
//    }
//
//    public void delete(long id) {
//        System.out.println("delete"+id);
//    }
}
