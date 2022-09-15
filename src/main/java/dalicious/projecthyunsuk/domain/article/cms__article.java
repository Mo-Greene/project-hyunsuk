package dalicious.projecthyunsuk.domain.article;

import lombok.*;

import java.sql.Timestamp;

@Data
public class cms__article {

    private Long article_id;
    private Timestamp created_datetime;
    private boolean in_pinned;
    private int view_count;
    private String title;
    private String content_html;
    private String content_string;

    private int board_id;

}
