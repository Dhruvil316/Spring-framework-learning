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

    @Override
    public int change(Task task) {
        // update query

        String selectQuery = "SELECT title, description FROM tasks WHERE id = ?";
        Task existing = jdbcTemplate.queryForObject(selectQuery, (rs, rowNum) -> {
            Task t = new Task();
            t.setTitle(rs.getString("title"));
            t.setDescription(rs.getString("description"));
            return t;
        }, task.getId());

        // Use existing values if null is passed
        String updatedTitle = task.getTitle() != null ? task.getTitle() : existing.getTitle();
        String updatedDescription = task.getDescription() != null ? task.getDescription() : existing.getDescription();

        // Update query
        String updateQuery = "UPDATE tasks SET title = ?, description = ? WHERE id = ?";
        return jdbcTemplate.update(updateQuery, updatedTitle, updatedDescription, task.getId());
    }

    @Override
    public int delete (int id) {
        String deleteQuery = "DELETE from tasks where id = ?";
        return jdbcTemplate.update(deleteQuery , id);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
