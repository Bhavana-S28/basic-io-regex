# basic-io-regex

# Energy Management System

This project is part of Home Assignment 1, focusing on building an Energy Management System with logging functionality for charging stations, energy sources, and the overall system.

## Role Distribution
- **Dörthe**: 
  - Log creation (charging stations, energy sources, system-wide).
  - Log searching functionality (by equipment name or date).
  - File handling and regular expressions.
  
## How to Run the Project
1. Clone the repository to your local machine.
    ```bash
    git clone https://github.com/yourusername/HA1-EnergyManagementSystem.git
    ```
2. Navigate to the project folder.
    ```bash
    cd HA1-EnergyManagementSystem
    ```
3. Compile and run the program using Java. Example command (adjust for your environment):
    ```bash
    javac src/IORegex/LogFileCreator.java
    java src/IORegex/LogFileCreator
    ```
4. You can search for log files using the `LogFileSearcher` class by specifying a directory and query.

---

## Log File Generation
Log files are created daily based on charging stations and energy sources. These files are stored in the `logs/` directory (or another specified directory).

## Log Searching
You can search for log files using:
- Equipment name (e.g., "Station1")
- Date in the format `yyyyMMdd` (e.g., "20241007")

  # Data Exchange Simulator

The **Data Exchange Simulator** is a simple Java program that demonstrates the use of byte streams and character streams for file handling. The program includes methods for writing binary data and textual data to files using Java's `FileOutputStream` and `FileWriter` classes.

---

## Features

1. **Byte Stream Example**  
   Writes a predefined array of bytes to a specified file.
   
2. **Character Stream Example**  
   Writes a string to a specified file using character encoding.

---

## Prerequisites

- **Java Development Kit (JDK):** Version 8 or above.
- A text editor or IDE such as IntelliJ IDEA, Eclipse, or VS Code.

---

# File Management Utilities

This project contains Java classes for managing file operations and logging metadata. It demonstrates:

- Writing binary and text data to files.
- Creating, moving, and deleting files.
- Managing file metadata such as name, path, and timestamps.

## Classes Overview

1. **DataExchangeSimulator**
   - Handles byte and character stream file writing.
   
2. **IOexpression**
   - Provides methods to create, move, and delete log files.

3. **LogMetaData**
   - Encapsulates metadata for log files, including timestamps, location, and file details.

## Usage

1. Clone the project and compile the Java files:
   ```bash
   javac -d . *.java
Run the IOexpression main method to see file management in action.
Example
Here's how you can use DataExchangeSimulator in your code:

java
Copy code
DataExchangeSimulator simulator = new DataExchangeSimulator();
simulator.byteStreamExample("output.bin");
simulator.characterStreamExample("output.txt", "Sample text content");
