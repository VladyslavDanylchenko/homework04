package com.softserveinc.task01;

public class CoffeeMachineV1 extends AbstractCoffeeMachine {

    public CoffeeMachineV1(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
    }

    @Override
    public boolean makeEspresso() {
        int coffee = 22;
        int water = 30;
        if (makeCoffee(coffee, water)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean makeAmericano() {
        int coffee = 22;
        int water = 100;
        if (makeCoffee(coffee, water)) {
            return true;
        }
        return false;
    }
}
