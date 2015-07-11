package com.strangegrotto.wunderjava2;

/**
 * Constant values corresponding with the endpoints defined in <a href=https://developer.wunderlist.com/documentation>the Wunderlist documenation</a>
 * @author ktoday
 */
public enum Endpoints {
    AVATAR("avatar"),
    FILE("files"),
    PREVIEW("previews"),
    FOLDER("folders"),
    MEMBERSHIP("memberships"),
    LIST("lists"),
    NOTE("notes"),
    POSITION("list_positions"),
    REMINDER("reminders"),
    SUBTASK("subtasks"),
    TASK("tasks"),
    TASK_COMMENTS("task_comments"),
    UPLOAD("uploads"),
    USER("user"),
    WEBHOOK("webhooks");
    
    private String endpoint;
    private Endpoints(String endpoint) { this.endpoint = endpoint; }
    public String toString() { return this.endpoint; }
}
