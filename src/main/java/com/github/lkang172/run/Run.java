package com.github.lkang172.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.*;

public record Run(Integer id, @NotEmpty String title, LocalDateTime startedOn, LocalDateTime completedOn,
                @Positive Integer miles,
                Location location) {

}
