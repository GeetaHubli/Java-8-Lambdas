package com.allstate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArithmaticExpressionTest{

    @Test
    public void testArithmeticMean(){

        List<Integer> listOfIntegers = new ArrayList<>();;
        listOfIntegers.add(3);
        listOfIntegers.add(1);
        listOfIntegers.add(7);
        listOfIntegers.add(3);
         ArithmaticExpression arithmaticexpression = new ArithmaticExpression(listOfIntegers);

        float mean = arithmaticexpression.calculateMean();
        assertEquals((double)mean, 3.5, 0.0);
    }

}