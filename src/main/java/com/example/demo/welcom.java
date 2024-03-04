package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcom {
	@Value("${spring.message}")
	private String message;
	@Value("${spring.num}")
	private String num;
	@Value("${spring.rollnum}")
	private String rollnum;
 @GetMapping("/Welcome")
 public String Welcome() {
	 return message;
 }
 @GetMapping("/nums")
 public String nums() {
	 return num;
 }
 @GetMapping("/idd")
 public String idd() {
	 return rollnum;
 }

}
