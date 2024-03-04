package com.scrap.meilisearch;

import io.vanslog.spring.data.meilisearch.client.ClientConfiguration;
import io.vanslog.spring.data.meilisearch.config.MeilisearchConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyClientConfig extends MeilisearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration() {

        String[] agents = {"prezo_local_base_prodcut"};
        return ClientConfiguration.builder()
                //.connectedToLocalhost()
                .connectedTo("http://meilisearch.prezo.box:7700")
                .withClientAgents(agents)
//                .enableSSL(false)                    // true: https, false: http
//                .host("{{meilisearch-server-host}}")
                .withApiKey("123456")
                .build();
    }
}

