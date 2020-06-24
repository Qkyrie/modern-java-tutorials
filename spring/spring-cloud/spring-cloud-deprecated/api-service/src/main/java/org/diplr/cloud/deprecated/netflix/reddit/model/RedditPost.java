package org.diplr.cloud.deprecated.netflix.reddit.model;

public class RedditPost {
    private String url;
    private String title;

    public String getUrl() {
        return url;
    }

    public RedditPost setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public RedditPost setTitle(String title) {
        this.title = title;
        return this;
    }
}
