package dev.organisation2.linkshortener.link;

import dev.organisation2.linkshortener.controller.LinkDto;
import org.springframework.stereotype.Service;

public interface LinkService {

    LinkDto createLink(LinkDto linkDto);
    String getLink(LinkDto linkDto);

}
