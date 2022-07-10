package dev.organisation2.linkshortener.link;

import dev.organisation2.linkshortener.controller.LinkDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LinkServiceImplementation implements LinkService {
    private Map<String, LinkDto> dtoMap = new HashMap<>();

    @Override
    public LinkDto createLink(LinkDto linkDto) {
        dtoMap.put(linkDto.getId(), linkDto);
        return linkDto;
    }

    @Override
    public String getLink(LinkDto linkDto) {
        return dtoMap.get(linkDto.getId()).getTargetUrl();
    }

}
