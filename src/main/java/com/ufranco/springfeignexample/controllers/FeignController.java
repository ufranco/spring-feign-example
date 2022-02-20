package com.ufranco.springfeignexample.controllers;

import com.ufranco.springfeignexample.records.Article;
import com.ufranco.springfeignexample.restClient.ArticleClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/article")
public class FeignController {

  private final ArticleClient restInterface;

  @GetMapping("/random")
  Article getRandomArticle() {
    return restInterface.getRandomArticle();
  }

  @GetMapping("/{page}")
  List<Article> getAllByPage(@PathVariable Long page) {
    return restInterface.getArticlesByPage(page);
  }

  @PostMapping
  Article createArticle(@RequestBody Article article) {
    return restInterface.createArticle(article);
  }
}