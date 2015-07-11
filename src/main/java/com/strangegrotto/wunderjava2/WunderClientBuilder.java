package com.strangegrotto.wunderjava2;

import com.strangegrotto.wunderjava2.jersey.JerseyClient;

public class WunderClientBuilder {
    private static final String API_URL = "http://a.wunderlist.com";
    private static final String AUTH_URL = "https://www.wunderlist.com/oauth";
    private static final int API_VERSION = 1;
    private static final WunderClientType DEFAULT_CLIENT_TYPE = WunderClientType.JERSEY;
    
    // ID that must be passed to Wunderlist with every request
    private String clientId;    
    private String clientSecret;
    private int apiVersion;
    private String apiUrl;
    private String authUrl;
    private WunderClientType type;
    
    private WunderClientBuilder(String clientId, String clientSecret) {
        this.clientId = null;
        this.apiVersion = WunderClientBuilder.API_VERSION;
        this.apiUrl = WunderClientBuilder.API_URL;
        this.authUrl = WunderClientBuilder.AUTH_URL;
        this.type = WunderClientBuilder.DEFAULT_CLIENT_TYPE;
    }
    
    /**
     * Convenience method for getting a default client
     * @param clientId ID given by Wunderlist to your application when you registered
     * @param clientSecret secret given by Wunderlist to your application when you registered
     * @return
     */
    public static WunderClient getClient(String clientId, String clientSecret) {
        return new WunderClientBuilder(clientId, clientSecret).build();
    }

    /**
     * Get a {@link WunderClientBuilder} for increased customization
     * @param clientId ID given by Wunderlist to your application when you registered
     * @param clientSecret secret given by Wunderlist to your application when you registered
     * @return
     */
    public static WunderClientBuilder getBuilder(String clientId, String clientSecret) {
        return new WunderClientBuilder(clientId, clientSecret);
    }
    
    public WunderClientBuilder withApiVersion(int apiVersion) { this.apiVersion = apiVersion; return this; }
    public WunderClientBuilder withWunderlistUri(String wunderlistUri) { this.apiUrl = wunderlistUri; return this; }
    public WunderClientBuilder withType(WunderClientType type) { this.type = type; return this; }

    public WunderClient build() {
        apiUrl = String.format("%s/v%i", this.apiUrl, this.apiVersion);
        switch (this.type) {
        case JERSEY:
            return new JerseyClient(this.clientId, this.clientSecret, apiUrl, this.authUrl);
        default:
            return new JerseyClient(this.clientId, this.clientSecret, apiUrl, this.authUrl);
        }
    }
}
