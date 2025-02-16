package com.blackstone.Blackstone_springboot.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.swing.text.StyledEditorKit;
import java.sql.Date;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", unique = true, nullable = false)
    private Long member_id;

    @Column(length = 15, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String id;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 1, nullable = false)
    private Boolean authority;

    @Column(length = 1, nullable = false)
    private Boolean status;

    public Member(
            String name,
            String email,
            String id,
            String password,
            Boolean authority,
            Boolean status) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
        this.authority = authority;
        this.status = status;
    }
}
