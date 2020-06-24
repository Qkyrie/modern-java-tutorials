package org.diplr.cloud.deprecated.netflix.reddit.client;

import configuration.feign.RedditFeignConfiguration;
import org.diplr.cloud.deprecated.netflix.reddit.model.RedditResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "reddit-service", url = "${com.deswaef.reddit.url}", configuration = RedditFeignConfiguration.class)
public interface RedditResource {

    @RequestMapping(method = RequestMethod.GET, value = "/java.json")
    RedditResponse posts();

}
