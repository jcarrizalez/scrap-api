package com.scrap.pruebas;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

import com.meilisearch.sdk.model.Key;
import com.meilisearch.sdk.model.Results;
import com.meilisearch.sdk.model.SearchResult;
import com.scrap.controllers.OrderController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.meilisearch.sdk.json.JacksonJsonHandler;

public class Reactive {

    private static Logger logger = LoggerFactory.getLogger(OrderController.class);

    public  ArrayList<HashMap<String, Object>> prueba() {

        Client client = new Client(new Config("http://meilisearch.prezo.box:80", "123456"));

        try {
            SearchResult search = client.index("prezo_local_base_product").search("cebolla");

            ArrayList<HashMap<String, Object>> hits = search.getHits();

            return hits;

            ///System.out.println(search.getHits());
//            Results<Key> keys = client.getKeys();

//            System.out.println(keys);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }


       // logger.debug();


//        JSONArray array = new JSONArray();
//        ArrayList items = new ArrayList() {{
//            add(new JSONObject().put("id", "1").put("title", "Carol").put("genres",new JSONArray("[\"Romance\",\"Drama\"]")));
//            add(new JSONObject().put("id", "2").put("title", "Wonder Woman").put("genres",new JSONArray("[\"Action\",\"Adventure\"]")));
//            add(new JSONObject().put("id", "3").put("title", "Life of Pi").put("genres",new JSONArray("[\"Adventure\",\"Drama\"]")));
//            add(new JSONObject().put("id", "4").put("title", "Mad Max: Fury Road").put("genres",new JSONArray("[\"Adventure\",\"Science Fiction\"]")));
//            add(new JSONObject().put("id", "5").put("title", "Moana").put("genres",new JSONArray("[\"Fantasy\",\"Action\"]")));
//            add(new JSONObject().put("id", "6").put("title", "Philadelphia").put("genres",new JSONArray("[\"Drama\"]")));
//        }};
//
//        array.put(items);
//        String documents = array.getJSONArray(0).toString();
//        Client client = new Client(new Config("http://meilisearch.prezo.box:7700", "123456"));
//
//        // An index is where the documents are stored.
//        Index index = client.index("movies");
//
//        index.addDocuments(documents);

              //      .index("prezo_local_base_prodcut");

            //SearchResult results = index.search("cebolla");
       //     System.out.println(client);

            //logger.debug("client");
//            List<Movie> hits = searchResponse.block().getHits();
//            // or
//            List<Movie> hits2 = client.indexes(indexes -> indexes
//                    .search(indexUid, Movie.class, search -> search
//                            .find(q -> q
//                                    .q("hello world")
//                                    .limit(1)
//                            )
//                            .map(SearchResponse::getHits)
//                    )
//            ).block();

    }
}
