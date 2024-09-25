## Assignment

### Question 1

An arraylist is monotonic if it is either monotone increasing or monotone decreasing.

An arraylist num is monotone increasing if for all i<=j, nums.get(i)<=nums.get(j). An arraylist nums is monotone decreasing if for all i<=j, nums.get(i)>=nums.get(j).

Given a integer arraylist nums, return if the given list is monotonic, or false otherwise.

Input: nums=[1,2,2,3]
Output: true

Input: nums=[1,3,2]
Output: false

constraints:

- 1<=nums.size()<=105
- -105<=nums.get(i)<=105

**Solution**
[Monotonic.java](../../../src/Linear/ArrayList/Monotonic.java)

### Question 2:

You are given an integer arraylist nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x+1 and x-1) appear in the arraylist

Return all lonely numbers in nums you may return the answer in any order.

Input: nums=[10,6,5,8]
Output: [10,8]

constraints:

- 1<=nums.size()<=105
- 0<=nums.get(i)<=106

**Solution**
[Lonely.java](../../../src/Linear/ArrayList/Lonely.java)

### Question 3:

you are given an integer arraylist nums. you are also given an integer key, which is present in nums. for every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that :

- 0<=i<=nums.size()-2
- nums.get(i)==keya and, nums.get(i+1)==target

Return target with the maximum count.

Input: nums=[1,100,200,1,100], key=1
Output: 100

constraints:

- 2<=nums.size()<=1000
- 1<=nums.get(i)<=1000
- Assume that the answer is unique

> Hint: count the number of times each target value follows the key in the arraylist choose the target with the maximum count and return it.

**Solution**
[Target.java](../../../src/Linear/ArrayList/Target.java)

### Question 4:

An arraylist nums of size n is beautiful if:

- nums is a permutation of the integers in the range [1,n]
- for every 0<=i<j<n, there is no index k with i<k<j where 2\*nums.get(k)==nums.get(i)+nums.get(j).
- Given the integer n, return any beautifull arraylist nums of size n. There will be atleast one valid answer for the given n.

Input: n=5
Output: [3,1,2,5,4]

constraints:

- 1<=n<=1000

**solution**
[Beautiful.java](../../../src/Linear/ArrayList/Beautiful.java)