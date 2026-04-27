package org.example;


public class Main {

    public static void main(String[] args) {


        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();


        experiment.runAllExperiments();


        System.out.println("\n--- SMALL DEMO (10 elements) ---");

        int[] demo = sorter.generateRandomArray(10);

        System.out.print("Before sorting: ");
        sorter.printArray(demo);

        sorter.basicSort(demo);
        System.out.print("After Bubble Sort: ");
        sorter.printArray(demo);


        int target = demo[3];
        int index = searcher.search(demo, target);
        System.out.println("Searching for " + target + " -> found at index: " + index);
    }
}