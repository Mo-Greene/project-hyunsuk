DROP TABLE IF EXISTS cms__article;
DROP TABLE IF EXISTS cms__board;

CREATE TABLE cms__article(
    article_id Long auto_increment,
    board_id integer default 0 not null ,
    created_datetime timestamp default now() not null ,
    is_pinned bit(1) not null ,
    view_count integer default 0 not null ,
    title varchar(32) not null ,
    content_html varchar(30) not null ,
    content_string varchar(30) not null ,
    primary key (article_id)
);

-- INSERT INTO cms__article(board_id, created_datetime, is_pinned, view_count, title, content_html, content_string) VALUES (1, '20220914', false, 0, 'title', 'content1', 'content2');
-- INSERT INTO cms__article(board_id, created_datetime, is_pinned, view_count, title, content_html, content_string) VALUES (1, '20220914', false, 0, 'title', 'content1', 'content2');

CREATE TABLE cms__board(
    board_id int auto_increment,
    name_ko varchar(16) not null ,
    primary key (board_id),
    unique (name_ko)
)
