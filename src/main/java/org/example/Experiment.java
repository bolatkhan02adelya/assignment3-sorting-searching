package org.example;

public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();



    public long measureSortTime(int[] arr, String type) {

        int[] copy = arr.clone();

        long startTime = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }


    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public void runAllExperiments() {
        System.out.println("========================================");
        System.out.println("      SORTING & SEARCHING EXPERIMENTS   ");
        System.out.println("========================================\n");


        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("--- Array size: " + size + " ---");


            int[] randomArray = sorter.generateRandomArray(size);


            if (size == 10) {
                System.out.print("Random array: ");
                sorter.printArray(randomArray);
            }


            long bubbleTimeRandom = measureSortTime(randomArray, "basic");
            System.out.println("Bubble Sort (random):   " + bubbleTimeRandom + " ns");


            long mergeTimeRandom = measureSortTime(randomArray, "advanced");
            System.out.println("Merge Sort  (random):   " + mergeTimeRandom + " ns");


            int[] sortedArray = randomArray.clone();
            sorter.advancedSort(sortedArray);

            if (size == 10) {
                System.out.print("Sorted array: ");
                sorter.printArray(sortedArray);
            }


            long bubbleTimeSorted = measureSortTime(sortedArray, "basic");
            System.out.println("Bubble Sort (sorted):   " + bubbleTimeSorted + " ns");


            long mergeTimeSorted = measureSortTime(sortedArray, "advanced");
            System.out.println("Merge Sort  (sorted):   " + mergeTimeSorted + " ns");


            int target = sortedArray[size / 2];
            long searchTime = measureSearchTime(sortedArray, target);
            int foundIndex = searcher.search(sortedArray, target);
            System.out.println("Binary Search target=" + target + ": found at index " + foundIndex + ", time: " + searchTime + " ns");

            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("            EXPERIMENT DONE             ");
        System.out.println("========================================");
    }
}