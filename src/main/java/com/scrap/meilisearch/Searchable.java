package com.scrap.meilisearch;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Meilisearch search common response data structure
 *
 * @see <a href="https://www.meilisearch.com/docs/reference/api/search">API specification</a>
 */
public interface Searchable {
    ArrayList<HashMap<String, Object>> getHits();

    Object getFacetDistribution();

    int getProcessingTimeMs();

    String getQuery();
}