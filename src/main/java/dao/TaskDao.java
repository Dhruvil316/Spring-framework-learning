package dao;

import Entities.Task;

import java.util.List;

public interface TaskDao {
    public int insert(Task task ) ;
    public int change ( Task task ) ;
    public int delete ( int id ) ;
    public Task getTask ( int id ) ;
    public List<Task> getAllTasks () ;
}

