<h1 align="center">
    Kids With the Greatest Number of Candies
</h1>

<p>
    There are <code>n</code> kids with candies. You are given an integer array 
<code>candies</code>, where each <code>candies[i]</code> represents the number of candies the <code>i<sup>th</sup></code> kid, and an integer 
<code>extraCandies</code>, denoting the number of extra candies that you have.

Return a boolean <i>array</i> of length <code>n</code>, where <code>result[i]</code> is <code>true</code>, after giving
the <code>i<sup>th</sup></code> kid all the <code>extraCandies</code>, they will have the <b>greatest</b> number of candies among all the kids, or <code>false</code> otherwise.

Note that <b>multiple</b> kids can have the <b>greatest</b> number of candies.
</p>

<hr>

<p>
    <b>Example 1:</b>

    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
</p>

<p>
    <b>Example 2:</b>

    Input: candies = [4,2,1,1,2], extraCandies = 1
    Output: [true,false,false,false,false]
    Explanation: There is only 1 extra candy.
    Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
</p>

<p>
    <b>Example 3:</b>

    Input: candies = [12,1,12], extraCandies = 10
    Output: [true,false,true]
</p>