package com.pingwit.part_24.homework.task_1;


import java.util.function.BinaryOperator;

public class MultiplyExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> biFunctionMultiplier = operationStrategyBiFunction(Operator.MULTIPLY); // biFunctionMultiplier -> calculatingResult / multiplyingResult / mathResult

        System.out.println(biFunctionMultiplier.apply(2, 3));
        System.out.println(biFunctionMultiplier.apply(4, 5));
    }

    private static BinaryOperator<Integer> operationStrategyBiFunction(Operator operator) { // можешь оставить название метода, а можешь заменить на calculate, будет более логичным
        return switch (operator) {
            case MULTIPLY -> (x, y) -> x * y;
            default -> throw new IllegalArgumentException("Unknown operation ");
        };
    }
}


