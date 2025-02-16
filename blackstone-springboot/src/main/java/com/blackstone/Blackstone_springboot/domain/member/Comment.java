package com.blackstone.Blackstone_springboot.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Table(name ="comment")
@Entity
@Getter
@NoArgsConstructor
public class Comment {

    private @Id @GeneratedValue Long comment_id;

    private String content;

    private Date created_date;

    private Member writer;

    private Board board_id;

}
