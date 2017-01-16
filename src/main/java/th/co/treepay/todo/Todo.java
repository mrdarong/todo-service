/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.treepay.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author darongpon
 */

@SpringBootApplication
// Begin Modified by Suttiruk Krutnoy 290916 for Fixed on Jasypt \
public class Todo {
    
	
    public static void main(String[] args) {
        SpringApplication.run(Todo.class, args);
    }
}
