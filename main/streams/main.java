package main.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum); // Output: 15
        // System.out.println(students.stream().takeWhile(student -> student.getName().charAt(0) == 'a').collect(Collectors.toList()));
//        List<Person> res = students.stream().map(stud -> new Person(stud.getId(), stud.getName())).collect(Collectors.toList());

        //System.out.println(res);
    }

    public static List<Integer> extractEvenNumber(List<Integer> nums){
        List<Integer> res = new ArrayList<>();
        for (Integer num: nums) {
            if (num % 2 == 0) {
                res.add(num);
            }
        }

        return res;
    }

}
