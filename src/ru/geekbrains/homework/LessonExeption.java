package ru.geekbrains.homework;

public class LessonExeption {
    public int arrayMeth (String[][]arr) throws MyArraySizeExeption, MyArrayDataExeption {
        int sum = 0;

        if(arr.length != 4)
                throw new MyArraySizeExeption();
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeExeption();

            try {
                for (int j = 0; j < arr.length; j++)
                    sum += Integer.parseInt(arr[i][j]);
            } catch (NumberFormatException e) {
                System.out.println(" Исключение NumberFormatException перехвачено!!!");
                throw new MyArrayDataExeption();
            }
        }

        return sum;
    }

    public static void main(String[] args) throws MyArraySizeExeption, MyArrayDataExeption {
        int sum = 0;

        LessonExeption LE = new LessonExeption();
        try {
            sum = LE.arrayMeth(new String[4][4]);
        }catch (MyArrayDataExeption e) {
            System.out.println("Исключение MyArrayDataExeption перехвачено!");
        }

        try {
            sum = LE.arrayMeth(new String[5][6]);
        } catch (MyArraySizeExeption ex) {
            System.out.println(" Исключение MyArraySizeExeption перехвачено!");
        }

        try {
            sum = LE.arrayMeth(new String[][]{{"2","3","4","One"},{"4","5","6","7"},{"8","9","10","11"},{"12","13","14","15"}});
        }catch (MyArrayDataExeption e) {
            System.out.println(" Исключение MyArrayDataExeption перехвачено!");
        }
        System.out.println(sum);
    }
}