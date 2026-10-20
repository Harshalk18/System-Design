
package com.prepflix.eventhub.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EventService {

    public List<Map<String, Object>> getAllEvents() {
        return List.of(
                Map.of(
                        "id", 1,
                        "name", "Java Developer Conference",
                        "location", "Hyderabad"
                ),
                Map.of(
                        "id", 2,
                        "name", "Spring Boot Workshop",
                        "location", "Pune"
                )
        );
    }
}
