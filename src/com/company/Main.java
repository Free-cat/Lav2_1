package com.company;

public class Main {

    public static void main(String[] args) {
        // Создание первого объекта на основе класса Rectangle
        Rectangle myRectangle1 = new Rectangle();
        Rectangle[] Rectangles = new Rectangle[25];

        for(int i=0; i<25; i++){
            int X = -20 + (int)(Math.random() * 40);
            int X1 = -20 + (int)(Math.random() * 40);
            int Y = -20 + (int)(Math.random() * 40);
            int Y1 = -20 + (int)(Math.random() * 40);
            Rectangles[i] = new Rectangle();
            Rectangles[i].SetFXY(X,X1,Y,Y1);
        }

        for(int i=0; i<25; i++){
            for (int j=0; j<25; j++){
                if(i!=j) {
                    if (i < j) {
                        if (check(Rectangles[i], Rectangles[j])) {
                            System.out.println("Прямоугольник " + i + " Пересекается с прямоугольником " + j);
                        }
                    }
                }
            }
        }

        // Установим значение полей
        myRectangle1.FSideA = 5;
        myRectangle1.FSideB = 10;
        myRectangle1.SetFXY(-1, -2, -1, -2);


        // Вызовим метод изменения названия фигуры
        myRectangle1.SetName("Большой прямоугольник");
        // определения периметра фигуры
        int Perimeter1 = myRectangle1.GetPerimeter();
        int Area1 = myRectangle1.GetArea();

        // Выведим  имя фигуры
        System.out.println(myRectangle1.FName);
        // значение периметра
        System.out.println(Perimeter1);
        // значение площади
        System.out.println(Area1);

        // Создание второго объекта на основе класса Rectangle
        Rectangle myRectangle2 = new Rectangle();
        // Установим значение полей
        myRectangle2.FSideA = 2;
        myRectangle2.FSideB = 3;
        // Вызовим метод
        // изменения названия фигуры
        myRectangle2.SetName("Маленький прямоугольник");
        myRectangle2.SetFSide(2, 5);
        myRectangle2.SetFXY(0, 3, 0, -3);

        // определения периметра фигуры
        int Perimeter2 = myRectangle2.GetPerimeter();
        int Area2 = myRectangle2.GetArea();

        // Выведим имя фигуры
        System.out.println(myRectangle2.FName);
        // значение периметра
        System.out.println(Perimeter2);
        // Значение площади
        System.out.println(Area2);

        boolean check = check(myRectangle1, myRectangle2);
        System.out.print(check);
        if (check) {
            System.out.println("Пересекаются");
        }
        else {
            System.out.print("Не пересекаются");
        }

    }

    private static boolean check(Rectangle box1, Rectangle box2) {

        if (box1.getY() < box2.getY1() || box1.getY1() > box2.getY()) {
            return false;
        }

        if (box1.getX1() < box2.getX() || box1.getX() > box2.getX1()) {
            return false;
        }
        return true;
    }
}
