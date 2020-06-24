package org.diplr.cloud.deprecated.netflix.reddit.model;

public class RedditResponse {
    private String kind;
    private RedditData data;

    public String getKind() {
        return kind;
    }

    public RedditResponse setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public RedditData getData() {
        return data;
    }

    public RedditResponse setData(RedditData data) {
        this.data = data;
        return this;
    }
}
