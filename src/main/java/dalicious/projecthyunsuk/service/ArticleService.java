package dalicious.projecthyunsuk.service;

import dalicious.projecthyunsuk.domain.article.cms__article;
import dalicious.projecthyunsuk.dto.ArticleRequestDto;
import dalicious.projecthyunsuk.dto.ArticleResponseDto;
import dalicious.projecthyunsuk.mapper.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleMapper articleMapper;

    // 게시글 목록 조회
    public List<cms__article> getAllArticle() {
        return articleMapper.getAll();
    }

    // 게시글 등록
    public void postArticle(ArticleRequestDto articleDto) {
        articleMapper.postArticle(articleDto);
    }

    // 게시글 삭제
    public void deleteArticle(Long article_id) {
        articleMapper.deleteArticle(article_id);
    }

    // 게시글 상세 조회
    public List<ArticleResponseDto> getArticle(Long article_id) {
        articleMapper.viewCountUpdate(article_id);
        return articleMapper.getArticle(article_id);
    }

}
