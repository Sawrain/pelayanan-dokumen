package id.ac.tazkia.akademik.dokumen.pelayanandokumen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PelayananDokumenApplication {
	public static void main(String[] args) {
		SpringApplication.run(PelayananDokumenApplication.class, args);
	}

	@Controller
	class IndexController {
		@GetMapping("/")
		public String layout(){
			return "layout";
		}
	}
}
