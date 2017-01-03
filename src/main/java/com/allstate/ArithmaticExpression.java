package com.allstate;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArithmaticExpression {
    List<Integer> list ;

    public ArithmaticExpression(List<Integer> list) {
        this.list = list;
    }


    public float calculateMean() {
        int sum = list
                .stream()
                .reduce(0,(acc,val) -> acc+val);
        return (float) sum/list.size();
    }
}
