package org.shersfy.oss.boot;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@ShellMethod("exec")
    public String exec(String command) throws IOException {
		Process process = Runtime.getRuntime().exec(command);
		return IOUtils.toString(process.getInputStream(), "GBK"
				+ "");
    }
}
