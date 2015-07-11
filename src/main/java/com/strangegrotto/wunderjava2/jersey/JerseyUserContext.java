package com.strangegrotto.wunderjava2.jersey;

import java.util.List;

import com.strangegrotto.wunderjava2.WunderUserContext;
import com.strangegrotto.wunderjava2.model.Task;
import com.strangegrotto.wunderjava2.model.TaskList;

public class JerseyUserContext implements WunderUserContext {
    
    private JerseyClient client;
    
    public JerseyUserContext(JerseyClient client) {
        this.client = client;
    }

    @Override
    public List<TaskList> getLists() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TaskList getList(long listId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TaskList createList(String title) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TaskList updateList(long listId, TaskList updatedList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TaskList makeListPublic(long listId, long revision, boolean isPublic) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteList(long listId, long revision) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Task> getListTasks(long listId, boolean getCompleted) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task getTask(long taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task createTask(Task task) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task updateTask(Task task) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task deleteTask(Task task) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
