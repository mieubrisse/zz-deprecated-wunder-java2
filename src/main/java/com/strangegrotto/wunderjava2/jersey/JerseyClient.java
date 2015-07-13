package com.strangegrotto.wunderjava2.jersey;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;

import com.google.common.base.Optional;
import com.google.common.net.MediaType;
import com.strangegrotto.wunderjava2.AuthEndpoints;
import com.strangegrotto.wunderjava2.WunderClient;
import com.strangegrotto.wunderjava2.WunderUserContext;
import com.strangegrotto.wunderjava2.jersey.auth.AccessTokenRequest;
import com.strangegrotto.wunderjava2.jersey.auth.AccessTokenResponse;

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
        

        Client client = ClientBuilder.newBuilder()
                .register(JacksonFeature.class)
                .register(new LoggingFilter(Logger.getLogger(JerseyClient.class.getName()), true))
                .build();
        this.apiTarget = client.target(apiUrl);
        this.authTarget = client.target(authUrl);
    }

    @Override
    public String getAccessToken(String accessCode) {
        AccessTokenRequest tokenReq = new AccessTokenRequest(this.clientId, this.clientSecret, accessCode);
        Builder reqBuilder = authTarget.path(AuthEndpoints.ACCESS_TOKEN.toString()).request(MediaType.JSON_UTF_8.toString());
        AccessTokenResponse tokenResp = reqBuilder.post(Entity.json(tokenReq), AccessTokenResponse.class);
        return tokenResp.accessToken;
    }

    @Override
    public WunderUserContext getUserContext(String accessToken) {
        return new JerseyUserContext(this, accessToken);
    }
    
    /**
     * Helper function for making requests to the Wunderlist API
     * @param method HTTP method (GET, PUT, etc)
     * @param endpoint API endpoint to access
     * @param accessToken Token signifying the user has given permission to access their account
     * @param data Request data
     * @param responseType Response object expected back
     * @return Object of type responseType decoded from the response body
     */
    protected <T> T makeRequest(String method, String endpoint, String accessToken, Optional<?> data, Class<T> responseType) {
        Builder reqBuilder = apiTarget.path(endpoint).request(MediaType.JSON_UTF_8.toString());
        reqBuilder.header(WunderClient.CLIENT_ID_HEADER, this.clientId);
        reqBuilder.header(WunderClient.ACCESS_TOKEN_HEADER, accessToken);
        if (data.isPresent()) {
            return reqBuilder.method(method, Entity.json(data.get()), responseType);
        } else {
            return reqBuilder.method(method, responseType);
        }
    }
}
