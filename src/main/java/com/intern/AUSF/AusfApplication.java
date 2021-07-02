package com.intern.AUSF;

import com.intern.AUSF.ue.Auth;
import com.intern.AUSF.ue.ResynchronizationInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class AusfApplication {

	public static void main(String[] args) {
		SpringApplication.run(AusfApplication.class, args);
	}
	@GetMapping
	public List<Auth> hello() {
		return List.of(
				new Auth(
						"supi",
						"snn",
						new ResynchronizationInfo(
								"rand",
								"auths"
						)
				)

		);
	}

}
