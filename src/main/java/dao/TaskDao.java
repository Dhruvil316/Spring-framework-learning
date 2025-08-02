package dao;

import Entities.Task;

public interface TaskDao {
    public int insert(Task task ) ;
    public int change ( Task task ) ;
    public int delete ( int id ) ;
}

