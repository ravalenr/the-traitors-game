package com.traitors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 🎭 The Traitors - Main Application Entry Point
 *
 * @SpringBootApplication bundles three annotations:
 *   - @Configuration         → this class can define Spring beans
 *   - @EnableAutoConfiguration → Spring auto-configures based on dependencies
 *   - @ComponentScan         → scans this package + subpackages for components
 *
 * @EnableScheduling is needed for phase timers (day/night countdowns)
 */
@SpringBootApplication
@EnableScheduling
public class TraitorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraitorsApplication.class, args);
        System.out.println("""
                
                ╔══════════════════════════════════════╗
                ║   🗡️  THE TRAITORS — Server Started   ║
                ║   http://localhost:8080               ║
                ╚══════════════════════════════════════╝
                """);
    }
}