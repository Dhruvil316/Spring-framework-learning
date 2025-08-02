package org.example;

import dao.TaskDao;
import dao.TaskDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class JdbcConfig {
    @Bean("dataSource")
    public DriverManagerDataSource getDataSoruce () {
        DriverManagerDataSource ds = new DriverManagerDataSource() ;
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("1234");
        return ds ;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate () {
        JdbcTemplate temp = new JdbcTemplate() ;
        temp.setDataSource(getDataSoruce());
        return temp ;
    }

    @Bean("taskDao")
    public TaskDao getTaskDao () {
        TaskDaoImp d = new TaskDaoImp() ;
        d.setJdbcTemplate(getTemplate());
        return d ;
    }
}
