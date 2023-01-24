package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hey there! Welcome..";
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Java Upgrade to 17");

		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream("git.properties");
		if (stream != null) {
			prop.load(stream);
			String id = prop.getProperty("git.commit.id");
//             String dirty = prop.getProperty("git.dirty");
//             if (dirty.equals("false")) {
//                 dirty = "";
//             } else {
//                 dirty = "(dirty)";
//             }
//             ver = ver + prop.getProperty("git.build.version")+dirty;
//             ver = ver + " - " + prop.getProperty("git.commit.id.describe");
//             ver = ver + " - " + prop.getProperty("git.build.time");
			System.out.println("Commitid = " + id);
		} else {
			// throw new MojoFailureException("Unable to find MyProject git.properties");
		}
	}

}
