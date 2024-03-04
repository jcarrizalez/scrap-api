package com.scrap.services.orders;

import com.scrap.services.MeiliSearchService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FinderOrderService {

    private final MeiliSearchService meiliSearchService = new MeiliSearchService();

    public ArrayList<HashMap<String, Object>> index(String search) {
        return meiliSearchService.index("provider_product").search(search);
    }
}
