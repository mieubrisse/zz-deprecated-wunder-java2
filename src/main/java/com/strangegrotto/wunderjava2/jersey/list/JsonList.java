package com.strangegrotto.wunderjava2.jersey.list;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.strangegrotto.wunderjava2.model.TaskList;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JsonList implements TaskList {
    
    public long revision;
    public long id;
    public DateTime creationTimestamp;
    public String title;
    public String listType;
    public String type;

    @Override
    public long getRevision() { return this.revision; }

    @Override
    public long getId() { return this.id; }

    @Override
    public DateTime getCreationTimestamp() { return this.creationTimestamp; }

    @Override
    public String getTitle() { return this.title; }

    @Override
    public String getListType() { return this.listType; }

    @Override
    public String getType() { return this.type; }

}
