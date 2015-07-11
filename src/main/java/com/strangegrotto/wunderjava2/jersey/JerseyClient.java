package com.strangegrotto.wunderjava2.jersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.google.common.base.Optional;
import com.strangegrotto.wunderjava2.WunderClient;
import com.strangegrotto.wunderjava2.WunderUserContext;

public class JerseyClient implements WunderClient {
    
    // ID given by Wunderlist after registering your application
    private String clientId;
    private String clientSecret;
    private WebTarget apiTarget;
    private WebTarget authTarget;
    private Client client;
    
    public JerseyClient(String clientId, String clientSecret, String apiUrl, String authUrl) {
        // TODO Error-checking
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        
        Client client = ClientBuilder.newClient();
        this.apiTarget = client.target(apiUrl);
        this.authTarget = client.target(authUrl);
    }

    @Override
    public String getAccessToken(String accessCode) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WunderUserContext getUserContext(String authToken) {
        return new JerseyUserContext(this);
    }
    
    public Response makeRequest(String method, String endpoint, String accessToken, Optional<Object> data) {
        Builder reqBuilder = apiTarget.path(endpoint).request();
        reqBuilder.header(WunderClient.CLIENT_ID_HEADER, this.clientId);
        reqBuilder.header(WunderClient.ACCESS_TOKEN_HEADER, accessToken);
        if (!data.isPresent()) {
            
        } else {
            
        }
        return reqBuilder.method(method);
    }
}
