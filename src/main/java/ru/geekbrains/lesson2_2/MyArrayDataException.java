package ru.geekbrains.lesson2_2;

public class MyArrayDataException extends NumberFormatException{

    private int col;
    private int row;
    private String value;

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public String getValue() {
        return value;
    }

    public MyArrayDataException(int col, int row,String value){
        super("Были найдены неверные данные: " + value + " в строке: "+ col+ " в столбце: "+ row);
       this.col=col;
       this.row=row;
       this.value=value;

    }
}
