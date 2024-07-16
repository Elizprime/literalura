package com.example.literalura;

import java.util.List;

public class GutendexResponse {
    private int count;
    private String next;
    private String previous;
    private List<Book> results;

    // Getters and setters

    public static class Book {
        private String title;
        private List<String> authors;
        private String language;
        private int downloadCount;

        // Getters and setters
    }
}








