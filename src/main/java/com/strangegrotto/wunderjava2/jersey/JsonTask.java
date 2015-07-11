package com.strangegrotto.wunderjava2.jersey;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonTask {
    @JsonProperty("id")
    long id;
    
    @JsonProperty("revision")
    long revision;
    
    @JsonProperty("assignee_id")
    long assigneeId;
    
    @JsonProperty("assigner_id")
    long assignerId;
    
    @JsonProperty("created_at")
    DateTime creationTimestamp;
    
    @JsonProperty("created_by_id")
    long creatorId;
    
    @JsonProperty("due_date")
    LocalDate dueDate;
    
    @JsonProperty("list_id")
    long listId;
    
    @JsonProperty("starred")
    boolean starred;
    
    @JsonProperty("title")
    String title;
    
    @JsonProperty("completed_at")
    DateTime completionTimestamp;
    
    @JsonProperty("completed_by_id")
    long completedById;
}
