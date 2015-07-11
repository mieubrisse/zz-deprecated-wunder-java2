package com.strangegrotto.wunderjava2.model;

public abstract class WunderEntity {
    private long revision;
    private long id;
    
    public long getRevision() { return this.revision; }
    public long getId() { return this.id; }
}
