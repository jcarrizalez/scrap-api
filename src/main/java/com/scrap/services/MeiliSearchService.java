package com.scrap.services;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;

public class MeiliSearchService {
    private String uid;
    private String prefix = "prezo_local_";
    private String hostUrl = "http://meilisearch.prezo.box:80";
    private String apiKey = "123456";
    private Client client = new Client(new Config(hostUrl, apiKey));
    private static Logger logger = LoggerFactory.getLogger(MeiliSearchService.class);
    public MeiliSearchService index(String uid) {
        this.uid = uid;
        return this;
    }
    public ArrayList<HashMap<String, Object>> search(String text) {
        try {
            return client.index(this.prefix + this.uid).search(text).getHits();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ArrayList<HashMap<String, Object>>();
        }
    }
}
