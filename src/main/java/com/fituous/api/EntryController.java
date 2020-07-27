package com.fituous.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @GetMapping("/status")
    public Status status() {
        return new Status(200, "Things are running");
    }
}
