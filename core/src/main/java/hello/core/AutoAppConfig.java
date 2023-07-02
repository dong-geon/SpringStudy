package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 컴포넌트 스캔 시작 위지(베이스) 지정
        basePackages = "hello.core",
        // @Configuration 애노테이션이 작성된 설정정보의 등록을 막기 위한 필터 적용
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    // 자동 빈 vs 수동 빈(승)
    // 스프링부트는 자동 빈과 수동 빈의 충돌이 일어나면 오류가 발생하도록 기본 값을 바꾸었다.
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
