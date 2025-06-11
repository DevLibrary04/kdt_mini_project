// 📁 src/main/java/edu/pnu/domain/User.java

package edu.pnu.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;  //회원 고유 ID (PK)

    @Column(length = 100, nullable = false, unique = true)
    private String id;  //(로그인 ID 용도)

    @Column(length = 255, nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
