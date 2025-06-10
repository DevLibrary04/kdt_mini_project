package edu.pun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// CORS
// 다른 출처(Origin)에서의 리소스 접근을 제한함. => 따로 허용해주는 범위를 명시해줘야 함


@Configuration
public class CustomConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
						.allowedMethods(CorsConfiguration.ALL)
						.allowedOrigins(CorsConfiguration.ALL);

		
		
//		registry.addMapping("/board/**")	// board를 포함하는 모든 주소
//				.allowedMethods(HttpMethod.GET.name(),
//								HttpMethod.POST.name())		// GET, POST 메소드
//				.allowedOrigins("http://localhost:3000", "http://127.0.0.1:3000");
		
		
		
//		registry.addMapping("/member/**")	// member를 포함하는 모든 주소
//				.allowedMethods(HttpMethod.GET.name(),
//								HttpMethod.PUT.name())		// GET, PUT 메소드
//				.allowedOrigins("http://localhost:3000");
		
		
//		registry.addMapping("/**")
//			.allowCredentials(true)
//			.allowedHeaders(HttpHeaders.AUTHORIZATION)
//			.exposedHeaders(HttpHeaders.AUTHORIZATION)
//			.allowedMethods(HttpMethod.GET.name(),
//								HttpMethod.POST.name(),
//								HttpMethod.PUT.name(),
//								HttpMethod.DELETE.name())
//			.allowedOrigins("http://localhost:3000",
//							"http://127.0.0.1:3000");
		
		
	}
}
