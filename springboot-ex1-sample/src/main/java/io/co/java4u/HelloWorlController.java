package io.co.java4u;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author java4u
 *
 */
@RestController
public class HelloWorlController {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
