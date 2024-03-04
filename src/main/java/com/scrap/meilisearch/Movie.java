package com.scrap.meilisearch;

import io.vanslog.spring.data.meilisearch.annotations.Document;
import jakarta.persistence.Id;

@Document(indexUid = "movies")
public class Movie {
    @Id private int id;
    private String title;
    private String description;
    private String[] genres;
}