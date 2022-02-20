package com.ufranco.springfeignexample.restClient;

import com.ufranco.springfeignexample.records.Article;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "article-client", url = "${feign.client.config.article-client.url}")
public interface ArticleClient {

  @GetMapping("/article/random")
  Article getRandomArticle();

  @GetMapping("/article/{page}")
  List<Article> getArticlesByPage(Long page);

  @PostMapping("/article")
  Article createArticle(Article article);

}
