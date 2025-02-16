package com.blackstone.Blackstone_springboot.domain.member;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name="recommand")
@Entity
public class Recommand {

    private Member member_id;

    private Board board_id;
}
