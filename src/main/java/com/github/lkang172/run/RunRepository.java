package com.github.lkang172.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
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
