package dev.organisation2.linkshortener.controller;


import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;

public class LinkDto {


    String id; String email; String targetUrl; LocalDate expirationDate; int i;


    public LinkDto(String id, String email, String targetUrl, LocalDate expirationDate, int i) {
        this.id = id;
        this.email = email;
        this.targetUrl = targetUrl;
        this.expirationDate = expirationDate;


    }

    public String getShortenedLink() {
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/s/{id}")
                .buildAndExpand(id)
                .toUriString();
    }
}