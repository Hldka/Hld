package Hl.day2711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codingbat {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,22,34,-45,-667));
        List<String> strings=new ArrayList<>(Arrays.asList("aax","dHxd","xgKhd","xMhd","HKxLM"));
        doubling1(nums);
        System.out.println(doubling(nums));
        System.out.println(addStar(strings));


    }public static  void doubling1(List<Integer> nums) {
nums.stream().map(t->t*2).forEach(codingbat::yazdir);

    }

    private static void yazdir(Integer a) {
        System.out.println(a+" ");
    }

    public static List<Integer> doubling(List<Integer> nums) {
return nums.stream().map(n -> n *2)
          .collect(Collectors.toList());
    }public static List<String> addStar(List<String> strings) {
return strings.stream().map(t->t.replaceAll("x","")).collect(Collectors.toList());
    }

}
