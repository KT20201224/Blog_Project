package me.kyoungtae.Blog.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Getter
public class UpdateArticleRequest {
    private String title;
    private String content;
}
