package com.strangegrotto.wunderjava2.jersey.list;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetListsResponse {
    @JsonDeserialize(as=ArrayList.class)
    public List<JsonList> lists;
}
