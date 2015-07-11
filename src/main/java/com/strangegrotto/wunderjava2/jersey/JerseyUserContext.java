package com.strangegrotto.wunderjava2.jersey;

public class JerseyUserContext implements WunderUserContext {
    
    private JerseyClient client;
    
    public JerseyUserContext(JerseyClient client) {
        
    }
}
