package com.strangegrotto.wunderjava2.model;

public class Task extends WunderEntity {
    long id;
    long assigneeId;
    long assignerId;
    DateTime creationTimestamp;
    long creatorId;
    LocalDate dueDate;
    long listId;
    long revision;
    boolean starred;
    String title;
}
