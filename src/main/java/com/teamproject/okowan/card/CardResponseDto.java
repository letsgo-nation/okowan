package com.teamproject.okowan.card;

import com.teamproject.okowan.entity.ColorEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class CardResponseDto {
    private Long cardId;
    private String title;
    private String description;
    private ColorEnum color;
    private String deadline; // 문자열로 저장하기 위한 필드

    public CardResponseDto(Card card) {
        this.cardId = card.getCard_id();
        this.title = card.getTitle();
        this.description = card.getDescription();
        this.color = card.getColor();

        // LocalDateTime을 "yyyy-MM-dd HH:mm" 형식의 문자열로 변환하여 저장
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.deadline = card.getDeadline().format(formatter); // deadline을 문자열로 변환하여 저장
    }
}
