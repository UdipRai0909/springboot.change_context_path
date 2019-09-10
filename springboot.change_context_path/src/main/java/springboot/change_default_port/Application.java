package springboot.change_default_port;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(Application.class);
//		
//		Map<String, Object> configMap = new HashMap<>();
//		configMap.put("server_port", 8568);
//		
//		springApplication.setDefaultProperties(configMap);
//		springApplication.run(args);
		
//		HashMap<String, Object> props = new HashMap<>();
//		props.put("server.port", 9999);
//		props.put("server.servlet.context-path", "/we-got-this");

		new SpringApplicationBuilder()
		    .sources(Application.class)                
//		    .properties(props)
		    .run(args);
	}

}
