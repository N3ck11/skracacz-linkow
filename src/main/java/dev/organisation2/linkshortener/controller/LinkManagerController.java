package dev.organisation2.linkshortener.controller;

import dev.organisation2.linkshortener.link.LinkService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Links")
public class LinkManagerController {
    private final LinkService linkService;

    public LinkManagerController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    LinkDto createLink (@RequestBody CreateLinkDto link){
        return linkService.createLink(link.toDto());
    }


}
