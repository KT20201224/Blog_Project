package me.kyoungtae.Blog.service;

import lombok.RequiredArgsConstructor;
import me.kyoungtae.Blog.domain.Article;
import me.kyoungtae.Blog.dto.AddArticleRequest;
import me.kyoungtae.Blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }
}
