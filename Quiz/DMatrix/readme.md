# Matrix Multiplication Program

This Java console application performs matrix multiplication on two user-input matrices. Given matrix dimensions and elements, the program calculates and displays the resulting matrix, using fundamental array manipulation and mathematical principles to achieve the result.

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

- Demonstrate understanding of programming concepts like variables, loops, and conditional statements.
- Develop proficiency in creating and manipulating 2-dimensional arrays.
- Handle user input and data type casting in Java.
- Practice string formatting for structured display.
- Analyze and solve mathematical problems with algorithms for matrix operations.

## Features

- **Dynamic Matrix Dimensions**: Supports matrices of arbitrary dimensions, provided they meet the multiplication condition.
- **Error Handling**: Validates user input to ensure matrix dimensions match for multiplication, and handles non-numeric inputs gracefully.
- **Result Formatting**: Displays the resulting matrix in a clean, organized format.

## Technologies Used

- **Java 21 (LTS)**: Required for program compatibility and latest Java features.
- **JDK 21**: Recommended for this project.

## Setup and Execution

### Prerequisites

### Running the Program

1. **Clone or Download the Repository**:
   ```bash
   git clone https://github.com/AbuduSamadu/DSA/tree/main/Lab
   cd DSA


2. **Open the Project in IntelliJ IDEA or Vscode:**
   - Open the project in IntelliJ IDEA.
   - Select the **Run** button in the top toolbar.
   - Choose the **Run** configuration.
   - Click **OK**.
   - The program will run in the console.

**OR  Compile the Java Program:**

```bash
javac MatrixMultiplication.java

**Run the Java Program:**

```bash
java MatrixMultiplication
```

## Usage

- **Enter Matrix Dimensions**: On running the program, you will be prompted to enter the dimensions of two matrices.
- **Enter Matrix Elements**: After entering the dimensions, you will be prompted to enter the elements of the matrices.
- **View Results**: The program will display the resulting matrix.

## Sample Input and Output

### Sample Input

```plaintext
Enter the number of rows for the first matrix: 3
Enter the number of columns for the first matrix: 3
Enter the elements of the first matrix:
1 2 3
4 5 6
7 8 9

Enter the number of rows for the second matrix: 3
Enter the number of columns for the second matrix: 3
Enter the elements of the second matrix:
1 2 3
4 5 6
7 8 9
```

### Sample Output

```plaintext
Enter the number of rows for the first matrix: 3
Enter the number of columns for the first matrix: 3
Enter the elements of the first matrix:
1 2 3
4 5 6
7 8 9

Enter the number of rows for the second matrix: 3
Enter the number of columns for the second matrix: 3
Enter the elements of the second matrix:
1 2 3
4 5 6
7 8 9

The resulting matrix is:
1 4 7
2 5 8
3 6 9
```

## Grading Criteria

| Criteria           | Points | Description                                                                 |
|--------------------|--------|-----------------------------------------------------------------------------|
| Correctness        | 40     | The program should produce the correct results for the given input.
| Input Validation   | 10     | The program should validate the input to ensure it meets the specified criteria.
| Code Quality       | 20     | The code should be well-structured, readable, and follow best practices.
| Output Format      | 10     | The output should be formatted correctly and clearly present the results.
| Efficiency         | 10     | The program should be optimized for performance and resource usage.

## Note

Input Validation: The program will terminate if the dimensions of the matrices do not match for multiplication.

## Conclusion

This project provides a hands-on example of working with arrays, conditional logic, and basic mathematical operations in Java, while also demonstrating string formatting techniques for structured console output.
