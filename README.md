# Interval Merge

Interval Merge is a Java application that merges overlapping intervals within a given list. This project provides a solution to the common interval merging problem and includes a Java function to achieve this.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [How to Use](#how-to-use)
- [Sample Input and Output](#sample-input-and-output)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The goal of this project is to merge overlapping intervals efficiently. It uses the provided list of intervals and merges any intervals that overlap to produce a list of non-overlapping intervals. The algorithm ensures a time complexity of O(N) and is implemented in Java.

## Features

- Merges overlapping intervals within a list.
- Provides a Java function for interval merging.
- Optimized for O(N) time complexity.
- Minimal and easy-to-understand code.

## How to Use

1. Clone this repository to your local machine:

  git clone https://github.com/your-username/interval-merge.git

  
2. Import the `IntervalMerge` class into your Java project.

3. Use the `mergeIntervals` method with a list of intervals to merge them.

4. Run your Java application to see the merged intervals.

## Sample Input and Output

### Sample Input:

    List<int[]> intervals = new ArrayList<>(Arrays.asList(
     new int[]{1, 3},
     new int[]{2, 6},
     new int[]{8, 10},
     new int[]{15, 18}
    ));
    
    IntervalMerge.mergeIntervals(intervals);
### Sample Output:

    [1, 6]
    [8, 10]
    [15, 18]

  
## Contributing
Contributions to this project are welcome. If you have ideas for improvements or new features, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

