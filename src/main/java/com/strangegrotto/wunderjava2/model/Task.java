package com.strangegrotto.wunderjava2.model;

import org.joda.time.LocalDate;

public interface Task extends WunderEntity {
    public long getAssigneeId();
    public long getAssignerId();
    public long getCreatorId();
    public LocalDate getDueDate();
    public long getListId();
    public boolean isStarred();
    public String getTitle();
}
