package com.teamproject.okowan.userBoard;

import com.teamproject.okowan.board.Board;
import com.teamproject.okowan.entity.BoardRoleEnum;
import com.teamproject.okowan.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor // 기본생성자
@Table(name = "userBoards")
public class UserBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBoardId;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private BoardRoleEnum role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public void setUserBoardId(Long userBoardId) {
        this.userBoardId = userBoardId;
    }

    public void setRole(BoardRoleEnum role) {
        this.role = role;
    }

    public UserBoard(BoardRoleEnum role, User user, Board board) {
        this.role = role;
        this.user = user;
        this.board = board;
    }
}
