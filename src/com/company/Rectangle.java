package com.company;

public class Rectangle {
    // Объявление класса
    // Члены класса:
    // Поля.
    public int FSideA;
    public int FSideB;
    public int FX1;
    public int FX2;
    public int FY1;
    public int FY2;
    public String FName;

    // методы
    public int GetPerimeter ()
    {
        return (FSideA + FSideB) * 2;
    }
    public void SetName(String newName)
    {
        FName = newName;
    }
    public String GetName()
    {
        return FName;
    }

    public int GetArea ()
    {
        return (FSideA * FSideB);
    }

    public void SetFSide(int sideA, int sideB)
    {
        FSideA = sideA;
        FSideB = sideB;
    }

    public void SetFXY(int x1, int x2, int y1, int y2)
    {
        FX1 = x1;
        FX2 = x2;
        FY1 = y1;
        FY2 = y2;
    }

    public int getX ()
    {
        return FX1;
    }
    public int getX1 ()
    {
        return FX2;
    }
    public int getY ()
    {
        return FY1;
    }
    public int getY1 ()
    {
        return FY2;
    }


}
