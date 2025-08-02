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

//        Task t = new Task() ;
//        t.setId(13);
//        t.setTitle("Samosa");
//        t.setDescription("Samosa party");
//
//
//        int res = task.insert(t) ;
//        System.out.println(res) ;

        System.out.println("updation ");
//        updating
        Task t1 = new Task() ;
        t1.setId(1);
//        t1.setTitle("Check Updation 02");
        t1.setDescription("check Description 03");

        int change_res = task.change(t1) ;
        System.out.println("the line is changed " + change_res);

    }
}