package com.strangegrotto.wunderjava2;

public enum AuthEndpoints {
    AUTHORIZE("authorize"),     // Unused; this is for the user to access for agreeing to application access
    ACCESS_TOKEN("access_token");
    
    private String endpoint;
    private AuthEndpoints(String endpoint) { this.endpoint = endpoint; }
    public String toString() { return this.endpoint; }
}
