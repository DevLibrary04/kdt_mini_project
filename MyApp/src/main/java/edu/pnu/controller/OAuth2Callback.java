package edu.pnu.controller;

import java.net.URLDecoder;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class OAuth2Callback{
	@PostMapping ("/api/jwtcallback")
public ResponseEntity<?> jwtCallBack(HttpServletRequest request) {
		String jwtToken= null;
		Cookie[] cookies= request.getCookies();
		for(Cookie cookie: cookies) {
			if(!cookie.getName().equals("jwtToken")) continue;
			try{

				jwtToken= URLDecoder.decode(cookie.getValue(), "utf-8");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}

		return ResponseEntity.ok()
					.header(HttpHeaders.AUTHORIZATION, jwtToken).build();
	}
}