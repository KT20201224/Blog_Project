package me.kyoungtae.Blog.repository;

import me.kyoungtae.Blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
