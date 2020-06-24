package org.diplr.cloud.deprecated.netflix.reddit.model;


public class RedditDataChildren {
    private String kind;
    private RedditPost data;

    public String getKind() {
        return kind;
    }

    public RedditDataChildren setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public RedditPost getData() {
        return data;
    }

    public RedditDataChildren setData(RedditPost data) {
        this.data = data;
        return this;
    }
}
