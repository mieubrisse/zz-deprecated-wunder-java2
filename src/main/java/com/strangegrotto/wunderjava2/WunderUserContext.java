package com.strangegrotto.wunderjava2;

import java.util.List;

public interface WunderUserContext {
    /* List endpoint */
    public List<TaskList> getLists();
    public TaskList getList(long listId);
    public TaskList createList(String title);
    public TaskList updateList(long listId, TaskList updatedList);
    public TaskList makeListPublic(long listId, long revision, boolean isPublic);
    public void deleteList(long listId, long revision);
    
    /* Task endpoint */
    public List<Task> getListTasks(long listId, boolean getCompleted);
    public Task getTask(long taskId);
    public Task createTask(Task task);
    public Task updateTask(Task task);
    public Task deleteTask(Task task);
}
