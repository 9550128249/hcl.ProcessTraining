package org.hcl.shoppingcart;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
public class Cashier {
private double totalPrice;
private String fileName;
private String filePath;
private PrintWriter printWriter;
public Cashier(String filePath,String fileName){
this.filePath=filePath;
this.fileName=fileName;
openStream();
}
public void openStream(){
	try{
printWriter=new PrintWriter(filePath+fileName+".txt");
	}catch(FileNotFoundException fe){
System.out.println("Exception Occured while creating printWriter obj ::"+fe.getMessage());
	}
}
public void calculateTotalPrice(ShoppingCart cart){
List<Product> products=cart.getProducts();
System.out.println(products.getClass());
for(Product product:products){
	writeProductToFile(product);
totalPrice=totalPrice+product.getPrice();
}
printWriter.println("------------------");
printWriter.println("TotalPrice :"+totalPrice);
printWriter.flush();
}
public void writeProductToFile(Product product){
printWriter.println("productName :"+product.getProductName()+"\tprice:"+product.getPrice()+"\t Date :"+new Date());
}
}
