package dao;

import Entities.Task;
import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper <Task> {

    @Override
    public @Nullable Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task newTask = new Task() ;
        newTask.setId(rs.getInt(1));
        newTask.setTitle(rs.getString(2));
        newTask.setDescription(rs.getString(3));
        newTask.setCompleted(rs.getBoolean(4));
        newTask.setCreatedAt(rs.getTimestamp(5));
        return newTask;
    }
}
