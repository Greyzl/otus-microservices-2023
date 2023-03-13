package ru.otus.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.Entity.Status;

@RestController
public class StatusController {

    @GetMapping("/health/")
    public ResponseEntity<Status> health(){
        return ResponseEntity.ok(new Status("OK"));
    }
}
