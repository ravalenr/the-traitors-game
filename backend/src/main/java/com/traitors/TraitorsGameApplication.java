package com.traitors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main application class for The Traitors Game.
 * A multiplayer deception game inspired by The Traitors TV show.
 */
@SpringBootApplication
@EnableScheduling
public class TraitorsGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraitorsGameApplication.class, args);
        System.out.println("\n===========================================");
        System.out.println("🎭 THE TRAITORS GAME - Server Started!");
        System.out.println("===========================================");
        System.out.println("Server running at: http://localhost:8080");
        System.out.println("H2 Console: http://localhost:8080/h2-console");
        System.out.println("===========================================\n");
    }
}
