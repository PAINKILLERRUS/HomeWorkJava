package ru.geekbrains.homework;

public class LessonExeption {

    public void arrayMeth (String[][]arr) throws MyArraySizeExeption {
        if(arr.length != 4)
            throw new MyArraySizeExeption();

        for (int i = 0 ; i < arr.length; i++) {
          if (arr[i].length != 4)
              throw new MyArraySizeExeption();
      }
    }

    public static void main(String[] args) throws MyArraySizeExeption {
        LessonExeption LE = new LessonExeption();
        LE.arrayMeth(new String[4][4]);
    }
}