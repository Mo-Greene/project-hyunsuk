package dalicious.projecthyunsuk.mapper;

import dalicious.projecthyunsuk.domain.article.cms__article;
import dalicious.projecthyunsuk.dto.ArticleRequestDto;
import dalicious.projecthyunsuk.dto.ArticleResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleMapper {

    // 게시글 목록 조회
    List<cms__article> getAll();

    // 게시글 등록
    void postArticle(ArticleRequestDto articleDto);

    // 게시글 삭제
    void deleteArticle(Long article_id);

    // 게시글 상세 조회
    List<ArticleResponseDto> getArticle(Long article_id);

    // view count 추가
    void viewCountUpdate(Long article_id);



}
