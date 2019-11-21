package com.spring.example;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcExampleAppWebJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleAppWebJpaApplication.class, args);
		System.out.println("Starting");
		openHomePage();
	}

	private static void openHomePage() {
		System.out.println("Opening Browser");
		String url = "http://localhost:8081/Student";
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		} else {
			Runtime runtime = Runtime.getRuntime();
			try {
				runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
