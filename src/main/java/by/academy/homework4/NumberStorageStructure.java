package by.academy.homework4;

import java.util.LinkedList;
import java.util.List;

public class NumberStorageStructure {
    public final List<Double> nums;

    public NumberStorageStructure(){
        nums = new LinkedList<>();
    }
    public void addNumber(double value) {
        nums.add(value);
    }

    public void deleteNumber(){
        nums.remove(nums.size() - 1);
    }

    public void deleteNumber(double value){
        nums.remove(value);
    }

    public void findClosestNumber(double value){
        double minModule = nums.get(0);

        for(var n : nums)
            if (Math.abs(n - value) < Math.abs(minModule - value))
                minModule = n;

        System.out.println("Число, ближайшее к заданному: " + minModule);
    }

    public void getList(){
        System.out.println(nums);
    }
}

