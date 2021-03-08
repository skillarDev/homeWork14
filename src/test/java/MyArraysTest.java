import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

class MyArraysTest {


    @Test
    void method1Test1() {
        MyArrays testArray = new MyArrays();
        Integer[] arrays = {5, 3, 4, 2, 1, 1};
        List<Integer> newArray = new ArrayList<>();
        newArray.add(2);
        newArray.add(1);
        newArray.add(1);
        Assertions.assertEquals(newArray, testArray.method1(arrays));
    }

//    @Test
//    void method1Test2() {
//        MyArrays testArray = new MyArrays();
//        Integer[] arrays = {5, 3, 2, 1, 1};
//        Throwable throwable = new RuntimeException("В массиве нет 4");
//        Assertions.assertEquals(throwable, testArray.method1(arrays));
//    }
//
//    @Test
//    void method1Test3() {
//        MyArrays testArray = new MyArrays();
//        Integer[] arrays = {5, 3, 2, 1, 1, 4};
//        Throwable throwable = new RuntimeException("После 4, нет данных");
//        Assertions.assertEquals(throwable, testArray.method1(arrays));
//    }

    @Test
    void method2Test1() {
        MyArrays testArray = new MyArrays();
        int[] arrays = {1, 4, 1, 4};
        List<Integer> newArray = new ArrayList<>();
        Assertions.assertEquals(true, testArray.method2(arrays));
    }

    @Test
    void method2Test2() {
        MyArrays testArray = new MyArrays();
        int[] arrays = {1, 1, 1, 1};
        List<Integer> newArray = new ArrayList<>();
        Assertions.assertEquals(false, testArray.method2(arrays));
    }

    @Test
    void method2Test3() {
        MyArrays testArray = new MyArrays();
        int[] arrays = {4, 4, 4, 4};
        List<Integer> newArray = new ArrayList<>();
        Assertions.assertEquals(false, testArray.method2(arrays));
    }

    @Test
    void method2Test4() {
        MyArrays testArray = new MyArrays();
        int[] arrays = {4, 1, 4, 2};
        List<Integer> newArray = new ArrayList<>();
        Assertions.assertEquals(false, testArray.method2(arrays));
    }



}