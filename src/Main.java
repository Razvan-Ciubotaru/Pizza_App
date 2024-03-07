import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws  Exception {
        //String name;

 DbFunction db= new DbFunction();
 Connection conn = db.connect_to_db("pizza","postgres", "0000");
 //db.createTable(conn, "employee");
        //db.insert_row(conn,"employee",  "Mihail", "Romania");
        //db.update_name(conn,"employee", "", "Maricica");
        //db.search_by_name(conn,"employee","Gigi");
        //db.search_by_id(conn,"employee", 9);
        //db.delete_value(conn,"employee","Maria");
       // db.delete_id(conn,"employee",7);
      // db.read_data(conn, "employee");

       // Meniu meniu = new Meniu();
        //PizzaApp app = new PizzaApp();
        Aranjare aranjare = new Aranjare();

    }
}