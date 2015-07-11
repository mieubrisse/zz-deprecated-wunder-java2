package com.strangegrotto.wunderjava2.model;

import org.joda.time.LocalDate;

public class Task extends WunderEntity {
    long assigneeId;
    long assignerId;
    long creatorId;
    LocalDate dueDate;
    long listId;
    boolean starred;
    String title;
}
