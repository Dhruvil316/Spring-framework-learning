package dao;

import Entities.Task;
import org.springframework.jdbc.core.JdbcTemplate;

public class TaskDaoImp implements TaskDao{

//    inject the jdbcTemplate here
    private JdbcTemplate jdbcTemplate ;

    @Override
    public int insert(Task task) {
        // insert query
        String insertQuery = "insert into tasks(id, title, description) values(?,?,?)";
        int res = this.jdbcTemplate.update(insertQuery , task.getId() , task.getTitle() , task.getDescription()) ;
        return res;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
