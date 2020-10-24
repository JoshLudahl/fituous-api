package com.fituous.api;

import com.fituous.api.models.Run;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @GetMapping("/status")
    public Status status() {
        return new Status(200, "Things are running");
    }

    @GetMapping("/run")
    public Run getRun() {
        return new Run(34,5);
    }
}
