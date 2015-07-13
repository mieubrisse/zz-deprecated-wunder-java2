package com.strangegrotto.wunderjava2.jersey.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenResponse {
    @JsonProperty("access_token")
    public String accessToken;
}
