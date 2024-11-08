# Peak-Column Finder in Matrix Program

This Java console application finds and displays all "peak-columns" in a user-provided matrix. A peak-column is defined as an element that is the maximum in its row and the minimum in its column. The program outputs the positions and values of each peak-column in a structured format.

## Table of Contents
- [Project Objectives](#project-objectives)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Execution](#setup-and-execution)
- [Usage](#usage)
- [Sample Input and Output](#sample-input-and-output)
- [Grading Criteria](#grading-criteria)
- [Note](#note)

## Project Objectives

This project aims to:

- Understanding of programming concepts such as variables, loops, and conditional statements.
- Proficiency in creating and manipulating 2 dimensions arrays (horizontal & vertical looping in 2D arrays)
- Ability to control user input and casting of data from one type to another
- Understanding of string formatting techniques to display in a readable and organized format.
- Ability to analyze the problem requirements and develop algorithms to solve mathematical problems


## Features

- **Peak-Column Detection**: Identifies all elements that are the maximum in their row and minimum in their column.
- **Arbitrary Matrix Size**: Handles matrices of varying dimensions, provided they meet input criteria.
- **Error Handling**: Ensures graceful handling of invalid input (e.g., non-numeric data, mismatched dimensions).
- **Formatted Output**: Displays each peak-column's position and value in a structured format.

## Technologies Used

- **Java 21 (LTS)**: Required for compatibility with the latest Java features.
- **JDK 21**: Recommended for compiling and running the project.

## Setup and Execution

### Prerequisites

- **Java Development Kit (JDK) 21**: Ensure JDK 21 is installed and configured on your system.

### Running the Program

1. **Clone or Download the Repository**:

   ```bash
   git clone https://github.com/AbuduSamadu/DSA/tree/main/Lab/peakColumns
   
   cd DSA/Lab/peakColumns

2. **Compile the Java Program**:

```bash
javac PeakColumns.java
```

3. **Run the Java Program**:

```bash
java PeakColumns
```

## Usage

- **Enter Matrix Dimensions**: On running the program, you will be prompted to enter the dimensions of the matrix.
- **Enter Matrix Elements**: After entering the dimensions, you will be prompted to enter the elements of the matrix.
- **View Results**: The program will display the positions and values of each peak-column in a structured format.

## Sample Input and Output

### Sample Input

```plaintext
Enter the number of rows for the matrix: 3
Enter the number of columns for the matrix: 3
Enter the elements of the matrix:
12 2 4
17 10 1
92 80 79
```

### Sample Output

```plaintext
(1, 1): 12
```

### Sample Output

![Screenshots](./Screenshot%20(5).png)

## Grading Criteria

| Criteria           | Points | Description                                                                 |
|--------------------|--------|-----------------------------------------------------------------------------|
| Correctness        | 40     | The program should produce the correct results for the given input.
| Input Validation   | 10     | The program should validate the input to ensure it meets the specified criteria.
| Code Quality       | 20     | The code should be well-structured, readable, and follow best practices.
| Output Format      | 10     | The output should be formatted correctly and clearly present the results.
| Efficiency         | 10     | The program should be optimized for performance and resource usage.

## Note

- Input Validation: The program will terminate if the dimensions of the matrix do not match the input criteria or if the input elements are not integers.

## Conclusion

This project provides a hands-on example of working with arrays, conditional logic, and basic mathematical operations in Java, while also demonstrating string formatting techniques for structured console output.