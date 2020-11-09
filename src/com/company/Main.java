package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car ();
        car.color = "blue";
        car.speed = 90;
        car.year = 2;
        car.name ="BMW";
        car.setWincode("redcar223dsx");
        System.out.println(car.getWincode());

        int[] array = {1,48,2,5,7,45,7,3,8,9,128};
        for (int i = 0; i < array.length-1; i++) {
            for (int j =i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;

                }
            }

        }
        for(int i = 0; i <array.length ; i++) {

            System.out.println(array[i]);

        }
    }
}
