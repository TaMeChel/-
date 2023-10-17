package p1;

import java.util.Scanner;

public class main {
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Введите наименование товара: ");
        String name = scanner.nextLine();
        System.out.print ("Введите количество товара: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print ("Введите Ваш номер телефона: ");
        String number = scanner.nextLine();
        System.out.print ("Введите Ваш адрес: ");
        String address = scanner.nextLine();
        System.out.printf ("Ваш заказ принят. Товар: %s в количестве: %d прибудет к Вам в ближайшее время. Товар доставим по адресу: %s. Ваш контактный номер: %s",name, quantity, number, address);
        scanner.close();
    }
}
