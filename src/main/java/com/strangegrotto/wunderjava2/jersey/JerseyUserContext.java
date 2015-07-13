package com.strangegrotto.wunderjava2.jersey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Optional;
import com.strangegrotto.wunderjava2.ApiEndpoints;
import com.strangegrotto.wunderjava2.WunderUserContext;
import com.strangegrotto.wunderjava2.jersey.list.JsonList;
import com.strangegrotto.wunderjava2.model.Task;
import com.strangegrotto.wunderjava2.model.TaskList;

public class JerseyUserContext implements WunderUserContext {
    
    private JerseyClient client;
    private String accessToken;
    
    public JerseyUserContext(JerseyClient client, String accessToken) {
        this.client = client;
        this.accessToken = accessToken;
    }

    @Override
    public List<? extends TaskList> getLists() {
        JsonList[] lists = this.client.makeRequest("GET", ApiEndpoints.LIST.toString(), this.accessToken, Optional.absent(), JsonList[].class);
        return Arrays.asList(lists);
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
