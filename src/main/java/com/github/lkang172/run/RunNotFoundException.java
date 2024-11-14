package com.github.lkang172.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException() {
        super("Run Not Found");
    }
}
