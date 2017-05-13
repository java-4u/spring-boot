package io.co.java4u;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author java4u
 *
 */
@RestController
public class HelloWorldController {

	@Autowired
	BasicConfiguration basicConfiguration;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/env")
	Map<String, Object> environment() {
		Map<String, Object> envMap = new HashMap<String, Object>();
		envMap.put("environment", basicConfiguration.getEnvironment());
		envMap.put("application_name", basicConfiguration.getAppname());
		return envMap;
	}

}
