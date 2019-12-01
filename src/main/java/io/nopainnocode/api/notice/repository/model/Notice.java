package io.nopainnocode.api.notice.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by no.pain.no.code@gmail.com
 * nopainnocode.tistory.com
 */
@Entity
@NoArgsConstructor
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint unsigned")
    @Getter
    private Long id;

    @Column(nullable = false, columnDefinition = "varchar(100) comment '공지사항 제목'")
    private String title;

    @Column(nullable = false, columnDefinition = "varchar(100) comment '공지사항 내용'")
    private String contents;

    @Column(nullable = false, columnDefinition = "timestamp comment '공지사항 작성일'")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(nullable = false, columnDefinition = "timestamp comment '공지사항 수정일'")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
