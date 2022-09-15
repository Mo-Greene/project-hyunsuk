package dalicious.projecthyunsuk.controller;

import dalicious.projecthyunsuk.domain.article.cms__article;
import dalicious.projecthyunsuk.dto.ArticleRequestDto;
import dalicious.projecthyunsuk.dto.ArticleResponseDto;
import dalicious.projecthyunsuk.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dalicious")
public class ArticleController {

    private final ArticleService articleService;

    // 게시글 목록 조회
    @GetMapping(value = "/all")
    public ResponseEntity<List<cms__article>> getAllArticle() {
        List<cms__article> cms__articleList = articleService.getAllArticle();
        return new ResponseEntity(cms__articleList, HttpStatus.OK);
    }

    // 게시글 생성
    @PostMapping(value = "/post")
    public ResponseEntity<String> postArticle(@RequestBody ArticleRequestDto articleDto) {
        articleService.postArticle(articleDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    // 게시글 삭제
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteArticle(@PathVariable("id") Long article_id) {
        articleService.deleteArticle(article_id);
        return new ResponseEntity(HttpStatus.OK);
    }

    // 게시글 상세 조회
    @GetMapping(value = "/{id}")
    public ResponseEntity<List<ArticleResponseDto>> getArticle(@PathVariable("id") Long article_id) {
        List<ArticleResponseDto> articleResponseDto = articleService.getArticle(article_id);
        return new ResponseEntity(articleResponseDto, HttpStatus.OK);
    }


}