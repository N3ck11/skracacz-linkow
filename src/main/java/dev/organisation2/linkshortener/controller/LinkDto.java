package dev.organisation2.linkshortener.controller;


import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;

public class LinkDto {


    private String id;
    private String email;
    private String targetUrl;
    private LocalDate expirationDate;
    int i;


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setI(int i) {
        this.i = i;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public int getI() {
        return i;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public LinkDto(String id, String email, int visits, String targetUrl, LocalDate expirationDate, int i) {
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