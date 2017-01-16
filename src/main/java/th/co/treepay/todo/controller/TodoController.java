/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.treepay.todo.controller;

import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.treepay.todo.model.Notebook;
import th.co.treepay.todo.service.TodoService;
import static org.springframework.http.ResponseEntity.ok;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author darongpon
 */

@RestController
public class TodoController {
    private final static Logger logger = LoggerFactory.getLogger(TodoController.class);
    
    @Autowired
    TodoService todoService;
    
    @RequestMapping(method = RequestMethod.PUT, value = "/add")
    public ResponseEntity<?> add(@RequestBody Notebook notebook) throws Exception {
        todoService.create(notebook);
        return ok(Collections.singletonMap("response", "ok"));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/edit")
    public ResponseEntity<?> edit(@RequestBody Notebook notebook) throws Exception {
        todoService.update(notebook);
        return ok(Collections.singletonMap("response", "ok"));
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteAll")
    public ResponseEntity<?> deleteAll() throws Exception {
        todoService.deleteAllNotebookRecords();
        return ok(Collections.singletonMap("response", "ok"));
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public ResponseEntity<?> delete(@RequestParam("id") long id) throws Exception {
        todoService.delete(id);
        return ok(Collections.singletonMap("response", "ok"));
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/searchAll")
    public List<Notebook> searchAll() throws Exception {
        return todoService.getAllNotebookRecords();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public Notebook search(@RequestParam("id") long id) throws Exception {
        return todoService.getNotebookById(id);
    }
}
