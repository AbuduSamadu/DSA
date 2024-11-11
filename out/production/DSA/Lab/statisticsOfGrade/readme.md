# Student Grades Analysis Program

This project is a Java console application that reads and analyzes the grades of students in a class. It calculates the maximum, minimum, and average grades, categorizes the grades into specific ranges, and displays a dynamic bar graph of the grade distribution.

## Table of Contents

- [Project Objectives](#project-objectives)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Execution](#setup-and-execution)
- [Usage](#usage)
- [Sample Input and Output](#sample-input-and-output)
- [Project Structure](#project-structure)
- [Grading Criteria](#grading-criteria)

## Project Objectives

This project aims to:

- Demonstrate how to create, initialize, and manipulate arrays in Java.
- Show proficiency with conditional statements.
- Utilize string formatting to display data in a structured format.
- Develop algorithms to efficiently calculate statistical values from the dataset.
- Generate a dynamic console-based bar graph representing the data.

## Features

- **Input Validation**: Ensures the user enters grades between 0 and 100.
- **Statistical Calculations**: Calculates the maximum, minimum, and average grades.
- **Grade Distribution Array**: Categorizes grades into five predefined ranges.
- **Dynamic Bar Graph**: Displays a dynamic bar graph in the console to represent the grade distribution visually.

## Technologies Used

- **Java 21 (LTS)**: Utilized for all programming logic and console output.
- **JDK 21**: Recommended for compatibility with the latest Java LTS features.

## Setup and Execution

### Prerequisites

- **Java Development Kit (JDK) 21**: Make sure JDK 21 is installed and configured on your system.

### Running the Program

1. **Clone or Download the Repository**:

   ```bash
   git clone <repository-url>
   cd <repository-directory>


2. **Compile the Java Program**:

   ```bash
    javac StudentGradesAnalysis.java


3. **Run the Java Program**:

    ```bash
    java StudentGradesAnalysis

## Usage

- **Enter Grades**: On running the program, you will be prompted to enter exactly 20 integer grades between 0 and 100, separated by spaces.

- **View Results**: The program will display:
Maximum, minimum, and average grades.
A bar graph of grade distributions across specified ranges (0-20, 21-40, etc.).
Exit: After displaying results, the program will terminate automatically.

## Sample Input and Output

### Sample Input

```plaintext
Enter the 20 grades:2 20 21 22 23 30 48 49 50 55 60 65 72 63 76 80 68 90 85 98

```

### Sample Output

![Build Status](./Screenshot%20(7).png)

## Project Structure

- **StudentGradesAnalysis.java**: The main Java file containing:
- ****Main Method****: Handles input collection, validation, and function calls.
Helper Methods:
calculateMax(): Finds the maximum grade.
calculateMin(): Finds the minimum grade.
calculateAverage(): Calculates the average grade.
generateStats(): Categorizes grades into ranges.
displayGraph(): Generates and displays the bar graph.

## Grading Criteria

| Criteria           | Points | Description                                                                 |
|--------------------|--------|-----------------------------------------------------------------------------|
| Correctness        | 40     | The program should produce the correct results for the given input.         |
| Input Validation   | 10     | The program should validate the input to ensure it meets the specified criteria. |
| Code Quality       | 20     | The code should be well-structured, readable, and follow best practices.    |
| Output Format      | 10     | The output should be formatted correctly and clearly present the results.   |
| Efficiency         | 10     | The program should be optimized for performance and resource usage.         |
| Bar Graph          | 10     | The bar graph should be visually appealing and accurately represent the grade distribution. |

## Note

Input Validation: The program will terminate if if any grade falls outside the 0-100 rang or if the input is not an integer.

Dynamic Graph: The bar graph adjusts to the grade distribution dynamically based on the input.


## Conclusion

This project provides a hands-on example of working with arrays, conditional logic, and basic statistical operations in Java, while also demonstrating string formatting techniques for structured console output. The dynamic graph generation helps in visualizing data in a compact, easy-to-read format, enhancing the user experience and understanding of the results.