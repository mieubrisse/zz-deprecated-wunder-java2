package com.strangegrotto.wunderjava2.model;

import org.joda.time.DateTime;

public abstract class WunderEntity {
    private long revision;
    private long id;
    private DateTime creationTimestamp;
    
    public long getRevision() { return this.revision; }
    public long getId() { return this.id; }
    public DateTime getCreationTimestamp() { return this.creationTimestamp; }
}
