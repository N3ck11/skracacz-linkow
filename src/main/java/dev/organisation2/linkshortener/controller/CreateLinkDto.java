package dev.organisation2.linkshortener.controller;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

    record CreateLinkDto(

            @Schema(description = "Identifier/alias to link. Used for redirection.", example = "link-alias", required = true)
            String id,
            String email,
            int visits,
            String targetUrl,
            LocalDate expirationDate, int i) {

        public LinkDto toDto() {
            return new LinkDto(
                    id,
                    email,
                    visits,
                    targetUrl,
                    expirationDate,
                    0
            );
        }

        @Override
        public String id() {
            return id;
        }

        @Override
        public String email() {
            return email;
        }

        @Override
        public int visits() {
            return visits;
        }

        @Override
        public String targetUrl() {
            return targetUrl;
        }

        @Override
        public LocalDate expirationDate() {
            return expirationDate;
        }

        @Override
        public int i() {
            return i;
        }
    }