package com.blackstone.Blackstone_springboot.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", unique = true, nullable = false)
    private Long board_id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 250, nullable = false)
    private String content;

    @Column(length = 15, nullable = false)
    private Member writer;

    @Column(length = 15, nullable = false)
    private Date created_date;

    @Column(length = 10, nullable = false)
    private int view_count;

}
