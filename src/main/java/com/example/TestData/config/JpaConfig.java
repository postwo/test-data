package com.example.TestData.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig { //JPA 엔티티(테이블 데이터)가 생성되거나 수정될 때 자동으로 "누가" 변경했는지를 기록할 수 있도록 설정하는 역할

    @Bean
    public AuditorAware<String> auditorAware() { // 작성자가 누구인지 체크
        return () -> Optional.of("coc"); // 로그인한 사용자 이름을 넣어주면 된다
    }

}

/*
* ex)
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;
}
✔ 새로운 User 데이터가 저장되면 → createdBy 칼럼에 "coc" 자동 입력
✔ 기존 User 데이터가 수정되면 → modifiedBy 칼럼에 "coc" 자동 변경
*
* */