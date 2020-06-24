package org.diplr.cloud.deprecated.netflix.reddit;

import org.diplr.cloud.deprecated.netflix.reddit.client.RedditResource;
import org.diplr.cloud.deprecated.netflix.reddit.model.RedditResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/reddit")
public class RedditRestController {

    @Autowired
    private RedditResource redditResource;

    @RequestMapping(method = GET)
    public RedditResponse get() {
        return redditResource.posts();
    }

}
