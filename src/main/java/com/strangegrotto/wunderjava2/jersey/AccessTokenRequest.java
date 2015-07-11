package com.strangegrotto.wunderjava2.jersey;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenRequest {
    @JsonProperty("client_id")
    String clientId;
    
    @JsonProperty("client_secret")
    String clientSecret;
    
    @JsonProperty("code")
    String accessCode;
    
    public AccessTokenRequest(String clientId, String clientSecret, String accessCode) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessCode = accessCode;
    }
}
