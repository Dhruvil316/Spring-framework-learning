package org.example;

import Entities.Task;
import dao.TaskDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

//      spring jdbc -> jdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template/config.xml") ;
        TaskDao task = context.getBean("taskDaoImpl" , TaskDao.class) ; // we can use the parent


        System.out.println("deletion ");
        int res = task.delete(13) ;
        System.out.println("the line is changed " + res);

    }
}