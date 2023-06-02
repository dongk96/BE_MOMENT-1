package com.back.moment.boards.dto;

import com.back.moment.boards.entity.Board;
import com.back.moment.users.entity.RoleEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
public class PhotographerBoardListResponseDto {
    private Long boardId;
    private  String title;
    private RoleEnum role;
    private  String nickName;
    private  String boardImgUrl;
    private String createdTime;
    private List<String> tag_boardList;

    public PhotographerBoardListResponseDto(Board board) {
        this.boardId = board.getId();
        this.title = board.getTitle();
        this.role = board.getUsers().getRole();
        this.nickName = board.getUsers().getNickName();
        this.boardImgUrl = board.getBoardImgUrl();
        this.createdTime = board.getCreatedAt();
        this.tag_boardList = board.getTagList();
    }
}
