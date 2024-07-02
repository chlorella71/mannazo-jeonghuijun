package com.jeonghuijun.user.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false, unique = true)
    private UUID userId; // 사용자 고유 식별자

    @Column(name = "email", nullable = false, unique = true)
    private String email; // 사용자 이메일

    @Column(name = "name", nullable = false)
    private String name; // 사용자 이름

    @Column(name = "nickname", nullable = false)
    private String nickname; //  닉네임

    @Column(name = "nationality")
    private String nationality; // 사용자 국적 (선택 사항)

    @Column(name = "language")
    private String language; // 사용자 언어 (선택 사항)

    @Column(name = "profile_photo")
    private String profilePhoto; // 프로필 사진 URL (선택 사항)

    @Column(name = "introduction")
    private String introduction; // 자기소개 (선택 사항)

    @Column(name = "city")
    private String city; // 사용자 거주지 (선택 사항)

    @Column(name = "authority")
    private String authority; // 사용자 권한 (기본 값 User)

    @Column(name = "gender")
    private String gender; // 성별 (기본 값 선택안함)

    @Column(name = "mbti")
    private String mbti; // Mbti (기본 값 선택안함)

    @Column(name = "interests", columnDefinition = "TEXT")
    private String interests; // 흥미 (선택 사항) 고정할거면 ENUM으로 변경해서 넣을 관심사 선정해야함

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "social_login_id")
    private String socialLoginId;

    @Column(name = "last_login_time")
    private Timestamp lastLoginTime; // 마지막 로그인 시간
}
