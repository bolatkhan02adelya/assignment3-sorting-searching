# Assignment 3: Sorting and Searching

## What this project does
This program tests three algorithms and measures how fast they work on different array sizes.

---

## Algorithms I chose

**Bubble Sort** (Basic Sorting)
It goes through the array and swaps neighboring elements if they are in the wrong order. It repeats this until everything is sorted.
Time complexity: O(n²) — slow on big arrays.

**Merge Sort** (Advanced Sorting)
It splits the array in half, sorts each half separately, then merges them back together.
Time complexity: O(n log n) — much faster than Bubble Sort on large arrays.

**Binary Search** (Searching)
It looks at the middle of the sorted array. If the target is smaller it goes left, if bigger it goes right. It keeps cutting the search area in half.
Time complexity: O(log n) — very fast. Only works on sorted arrays.

---

## Results

On small arrays (size 10), Bubble Sort was slightly faster than Merge Sort because Merge Sort has extra work from recursion.

On medium arrays (size 100), Merge Sort became faster — about 2x faster than Bubble Sort.

On large arrays (size 1000), Merge Sort was about 22 times faster than Bubble Sort. This clearly shows the difference between O(n²) and O(n log n).

Binary Search was extremely fast on all sizes — under 3200 ns even for size 1000 — because it eliminates half the data every step.

Sorted arrays were faster to process than random arrays for both sorting algorithms because less swapping is needed.

---

## Why Binary Search needs a sorted array
Binary Search decides which half to search based on whether the target is bigger or smaller than the middle element. If the array is not sorted, this logic breaks and the result will be wrong.

---

## What I learned
I learned that even if two algorithms do the same job, their speed can be very different. Bubble Sort is easy to understand but becomes very slow when the array gets bigger. Merge Sort is a bit harder to write but handles large data much better. The experiment results matched exactly what Big-O theory predicts.
