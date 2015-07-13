package com.strangegrotto.wunderjava2.model;

import org.joda.time.DateTime;

public interface WunderEntity {
    public long getRevision();
    public long getId();
    public DateTime getCreationTimestamp();
}
