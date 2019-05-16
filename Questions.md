# Questions

<h2> Problem 1 </h2>

Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

<h3>Input:</h3>
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

<h3>Output:</h3>
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

<h3>Constraints:</h3>
1 <= T <= 100<br>
1 <= N <= 10^7<br>
1 <= Ai <= 10^10

<h3>Example:</h3>
<h4>Input:</h4>
2<br>
5 12<br>
1 2 3 7 5<br>
10 15<br>
1 2 3 4 5 6 7 8 9 10<br>
<h4>Output:</h4>
2 4<br>
1 5<br>

__________________________________________________________________________________________

<h2> Problem 2 </h2>

Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

<h3>Input:</h3>
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

<h3>Output:</h3>
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.

<h3>Constraints:</h3>
1 <= T <= 100<br>
1 <= N <= 10^6<br>
1 <= Ai <= 10^8<br>

<h3>Example:</h3>
<h4>Input:</h4>
2<br>
1<br>
1<br>
5<br>
1 3 5 2 2

<h4>Output:</h4>
1<br>
3

__________________________________________________________________________________________

<h2> Problem 3</h2>

Given a matrix mat[][] of size M*N. Traverse and print the matrix in spiral form.

<h3>Input:</h3> 
The first line of the input contains a single integer T, denoting the number of test cases. Then T test cases follow. Each testcase has 2 lines. First line contains M and N respectively separated by a space. Second line contains M*N values separated by spaces.

<h3>Output:</h3>
Elements when travelled in Spiral form, will be displayed in a single line.

<h3>Constraints:</h3>
1 <= T <= 100<br>
2 <= M, N <= 10<br>
0 <= Ai <= 100<br>

<h3>Example:</h3>
<h4>Input:</h4>
1<br>
4 4<br>
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16<br>

<h4>Output:</h4>
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

<h3>Explanantion</h3>
<h4>Test Case 1</h4>
<img src="https://www.geeksforgeeks.org/wp-content/uploads/spiral-matrix.png">


