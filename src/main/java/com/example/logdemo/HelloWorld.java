
package com.example.logdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);


    @GetMapping("/hello-world")
    public String HelloWorld() {
        logger.info("Logging INFO with Logback");
        logger.error("Logging ERROR with Logback");
        return ("Hello World");
    }
}

