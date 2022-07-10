package dev.organisation2.linkshortener.controller;

import dev.organisation2.linkshortener.link.LinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RequestMapping("/s")
@RestController
public class RedirectController {

    private final LinkService linkService;

    public RedirectController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{id}")

    public void redirectLink(
            @PathVariable LinkDto id, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect(linkService.getLink(id));
    }


}
