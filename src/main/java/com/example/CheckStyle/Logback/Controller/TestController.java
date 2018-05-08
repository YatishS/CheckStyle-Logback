package com.example.CheckStyle.Logback.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//This import used to verify checkstyle
import java.util.concurrent.BlockingDeque;

@RestController
public class TestController {

    private static Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public String sayHi() {
        LOG.info("***** Logging info msg using slf4j/logback.");
        return "Hello CheckStyle & Logback world!!!";
    }
}
