package org.example;

import Entities.Task;
import dao.TaskDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//to start server : brew services start mysql
public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

//      spring jdbc -> jdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template/config.xml") ;
        TaskDao task = context.getBean("taskDaoImpl" , TaskDao.class) ; // we can use the parent
        List<Task> allTasks = task.getAllTasks() ;
        for ( Task t : allTasks ) {
            System.out.println(t);
        }
    }
}