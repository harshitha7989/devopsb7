package com.Project.maven_app;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println("===== Environment Variables =====");
        checkEnvironmentVariables();
        
        System.out.println("\n===== System Properties =====");
        checkSystemProperties();
        
        System.out.println("\n===== System Information =====");
        checkSystemInfo();
    }

    // Method to check and print all environment variables
    private static void checkEnvironmentVariables() {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.println(envName + " = " + env.get(envName));
        }
    }

    // Method to check and print important system properties
    private static void checkSystemProperties() {
        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("java.home = " + System.getProperty("java.home"));
        System.out.println("user.home = " + System.getProperty("user.home"));
        System.out.println("user.dir = " + System.getProperty("user.dir"));
        System.out.println("os.name = " + System.getProperty("os.name"));
        System.out.println("os.version = " + System.getProperty("os.version"));
    }

    // Method to print basic system information
    private static void checkSystemInfo() {
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");

        System.out.println("Operating System: " + os);
        System.out.println("Architecture: " + architecture);
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free Memory (bytes): " + Runtime.getRuntime().freeMemory());
        System.out.println("Max Memory (bytes): " + Runtime.getRuntime().maxMemory());
        System.out.println("Total Memory (bytes): " + Runtime.getRuntime().totalMemory());
    }
}
