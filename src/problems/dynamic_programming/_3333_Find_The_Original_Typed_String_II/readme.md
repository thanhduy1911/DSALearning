# Description
Alice is attempting to type a specific problems.string on her computer. However, she tends to be clumsy and **may** press a key for too long, resulting in a character being typed **multiple** times.

You are given a problems.string `word`, which represents the **final** output displayed on Alice's screen. You are also given a **positive** integer `k`.

Return the total number of possible original strings that Alice might have intended to type, if she was trying to type a problems.string of size **at least** `k`.

Since the answer may be very large, return it **modulo** **10<sup>9</sup>+ 7**.
### **Example 1:**

>**Input**: word = "aabbccdd" k = 7  
**Output**: 5  
**Explanation**:  
The possible strings are: `"aabbccdd"`, `"aabbccd"`, `"aabbcdd"`, `"aabccdd"`, and `"abbccdd"`.

### **Example 2:**

>**Input**: word = "aabbccdd" k = 8  
**Output**: 1
**Explanation**:
The only possible problems.string is `"aabbccdd"`.

### **Example 3:**
>**Input**: word = "aaaabb" k = 3  
**Output**: 8

### Constraints:

* `1 <= word.length <= 5 * 105`
* `word` consists only of lowercase English letters.
* `1 <= k <= 2000`