package floatClould.floatClould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.font.TrueTypeFont;

import java.awt.geom.PathIterator;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class FloatClouldApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloatClouldApplication.class, args);
	}


	@RequestMapping("/")
	public String welcome(){
		return "welcome to My first Project";
	}

	@RequestMapping("/hello")
	public String hello(){
		return "login jsp";
	}

	@PreAuthorize("hasRole('ROLR_ADMIN')")
	@RequestMapping("/relAuto")
	public String relAuto(){
		return "admin jsp";
	}
}
