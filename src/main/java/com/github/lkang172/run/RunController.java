package com.github.lkang172.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning run", LocalDateTime.now(), LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 3,
                Location.INDOOR));
        runs.add(new Run(2, "Morning run", LocalDateTime.now(), LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 3,
                Location.INDOOR));
        runs.add(new Run(2, "Morning run", LocalDateTime.now(), LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 3,
                Location.INDOOR));
    }

    @GetMapping("/hello")
    String home() {
        return "hello world!";
    }

}
