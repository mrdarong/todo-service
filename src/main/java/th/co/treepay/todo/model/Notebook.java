/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.treepay.todo.model;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author darongpon
 */
@Entity
@Table(name = "notebook")
public class Notebook{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="massage")
    private String message;
    @Column(name="todo_time")
    private Date todoTime;

    public Notebook() {
    }

    public Notebook(String message, Date todoTime) {
        this.message = message;
        this.todoTime = todoTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTodoTime() {
        return todoTime;
    }

    public void setTodoTime(Date todoTime) {
        this.todoTime = todoTime;
    }
    
    
    
}
