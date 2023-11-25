# Plant Watering Application

## Overview
This Kotlin application manages plants, allowing users to add, remove, view, and generate watering schedules for different types of plants. It consists of two main classes: `PlantWateringApp` and `PlantLog`.

### Plant Class
- Represents a plant with properties such as ID, name, type, and watering frequency.
- Overrides `equals`, `hashCode`, and `toString` methods for comparison, hashing, and string representation.

### PlantWateringApp Class
- Manages a list of plants (`MutableList<Plant>`) and provides functionalities related to managing these plants.
- **Functions:**
    - `addPlant(plant: Plant)`: Adds a new plant to the list, checking for duplicates based on ID, name, and type.
    - `removePlant(plant: Plant)`: Removes a plant from the list.
    - `viewPlants()`: Displays the list of plants.
    - `generateWateringSchedule()`: Generates watering schedules based on plant types.

### PlantLog Class
- Manages a log of plants using a `MutableMap<Int, Plant>` to store plants with unique IDs.
- Provides functionalities related to managing the plant log.
- **Functions:**
    - `addPlant(plant: Plant)`: Adds a plant to the log with a unique ID.
    - `removePlantById(id: Int)`: Removes a plant from the log by ID.
    - `viewPlantById(id: Int)`: Retrieves a plant from the log by ID.
    - `viewAllPlants()`: Displays all plants stored in the log.

## Execution Flow (Main Function)
1. Creates instances of `PlantWateringApp` and `PlantLog`.
2. Creates three plant instances (`plant1`, `plant2`, `plant3`) with different attributes.
3. Adds these plants to both the `PlantWateringApp` and `PlantLog`.
4. Views the list of plants from `PlantWateringApp`.
5. Generates watering schedules for the plants in `PlantWateringApp`.
6. Displays all plants stored in the `PlantLog`.
7. Retrieves a specific plant from the log by ID and displays it.
8. Removes a plant from the log by ID.
9. Displays the remaining plants in the log.

## Execution
The application demonstrates functionalities to manage plants, maintain logs, and generate watering schedules based on plant types.

---

# Overview

As a software engineer, this project aims to create a plant management system using Kotlin, providing functionalities to manage plant records, generate watering schedules, and maintain a plant log efficiently.

## Purpose

The purpose of this software is to demonstrate proficiency in Kotlin programming and software development by creating a practical application to manage plant data and schedules.

## Software Demo

[Software Demo Video](http://youtube.link.goes.here)
This one-minute YouTube demo showcases the software in action, providing a walkthrough of the code and demonstrating the functionalities.

## GitHub Repository

[GitHub Repository](http://github.link.goes.here)
The source code for this Plant Watering Application is available in this GitHub repository. It includes the Kotlin code for the application's functionalities, such as managing plants, generating watering schedules, and maintaining a plant log.

# Development Environment

The software was developed using:
- **Programming Language:** Kotlin
- **Tools:** IntelliJ IDEA, Kotlin compiler

# Useful Websites

Here are some websites that were helpful during the development process:
- [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
- [Stack Overflow](https://stackoverflow.com/)
- [GitHub](https://github.com/)
