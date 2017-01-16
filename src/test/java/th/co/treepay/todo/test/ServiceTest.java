///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package th.co.treepay.todo.test;
//
//import java.util.Date;
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import th.co.treepay.todo.Todo;
//import th.co.treepay.todo.model.Notebook;
//import th.co.treepay.todo.service.TodoService;
//
///**
// *
// * @author darongpon
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Todo.class)
//public class ServiceTest {
//    @Autowired
//    private TodoService todoService;
//    @Test
//    public void serviceTest() throws Exception{
//        Notebook notebook1 = new Notebook();
//        notebook1.setMessage("test01");
//        notebook1.setTodoTime("testTimeo1");
//        Notebook notebook2 = new Notebook();
//        notebook2.setMessage("test02");
//        notebook2.setTodoTime("testTimeo2");
//        Notebook notebook3 = new Notebook();
//        notebook3.setMessage("test03");
//        notebook3.setTodoTime("testTimeo3");
//        Notebook notebook4 = new Notebook();
//        notebook4.setMessage("test04");
//        notebook4.setTodoTime("testTimeo4");
//        todoService.create(notebook1);
//        todoService.create(notebook2);
//        todoService.create(notebook3);
//        todoService.create(notebook4);
//        List<Notebook> notebooks = todoService.getAllNotebookRecords();
//        int i = 1;
//        for(Notebook notebook : notebooks){
//            System.out.println(i++);
//            System.out.println(notebook.getTodoTime());
//            System.out.println(notebook.getMessage());
//            System.out.println();
//        }
//
//    }
//}
