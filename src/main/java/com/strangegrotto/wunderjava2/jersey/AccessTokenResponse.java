package com.strangegrotto.wunderjava2.jersey;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenResponse {
    @JsonProperty("access_token")
    String accessToken;
}
