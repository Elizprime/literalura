package com.example.literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {

    @Autowired
    private RestTemplate restTemplate;

    public GutendexResponse searchBooksByTitle(String title) {
        String url = "https://gutendex.com/books?search=" + title;
        return restTemplate.getForObject(url, GutendexResponse.class);
    }
}










