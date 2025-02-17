package com.sesac.itall.domain.question;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Getter
public class QuestionResponseDTO {

    private Long id;
    private String title;
    private String content;
    private String formattedRegdate;
    private String nickname;  // 작성자 정보 추가

    public QuestionResponseDTO(Question question) {
        this.id= question.getId();
        this.title= question.getTitle();
        this.content= question.getContent();
        this.formattedRegdate= formattedRegdate(question.getRegdate());
        this.nickname = (question.getMember() != null) ? question.getMember().getNickname() : "익명";    // 작성자 닉네임 설정
    }

    private String formattedRegdate(Date date) {

        if (date == null) {
            return "날짜 없음";
        }

        LocalDateTime regdateTime= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime now = LocalDateTime.now();
        Duration duration= Duration.between(regdateTime, now);
        long hours= duration.toHours();

        if (hours < 24) {
            return hours + "시간 전";  // 24시간 이내라면 "n시간 전"
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            return formatter.format(date);  // 24시간 이후라면 "yyyy-MM-dd"
        }
    }
}
