package lab3;

import java.util.Scanner;

class Product {
    String productname;
    String productID;
    float price;
    int quantityInStock;
    int dis;

    void discount(int dis) {
        price = price - (dis * 0.01f) * price;
             }
}

class ProductMain {
    public static void main(String[] arg, String price) {
        Product[] item = new Product[5];
        Scanner obj = new Scanner(System.in); 
        for (int i = 0; i < item.length; i++) {
            item[i] = new Product(); 
            System.out.print("Enter the name of product " + (i + 1) + ": ");
            item[i].productname = obj.nextLine();
            
            System.out.print("Enter the product id of product " + (i + 1) + ": ");
            item[i].productID = obj.nextLine();
            
            System.out.print("Enter the price of the product " + (i + 1) + ": ");
            item[i].price = obj.nextFloat();
            
            System.out.print("Enter the quantity of the product " + (i + 1) + ": ");
            item[i].quantityInStock = obj.nextInt();
            obj.nextLine();         }

        obj.close();  
        int dis=5;
        for(int i=0;i<item.length;i++)
        {
           item[i].discount(dis);
           System.out.println("After applying the discount of " + dis + "%,on product"+(i+1)+" you need to pay Rs." + price);
 
        }

          }
       
}