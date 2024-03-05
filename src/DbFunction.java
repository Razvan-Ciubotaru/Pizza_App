import java.sql.*;
import java.util.Scanner;

public class DbFunction {

    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" +dbname,user,pass);
            if(conn!= null){
                System.out.println("Connection Established");

            }   else {
                System.out.printf("Connection Faild!");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
    public void createTable(Connection conn, String table_name){
        Statement statement;
        try{

            String query = "create table "+table_name+"(empid SERIAL, name varchar(200), address varchar(200),primary key(empid))";

            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tabel creat");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public  void insert_row(Connection conn,String table_name, String name, String address){
        Statement statement;
        try{
            String query = String.format("insert into %s(name, address) values('%s', '%s');", table_name, name, address );
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inseerted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public  void read_data(Connection conn, String table_name){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s",table_name);
            statement = conn.createStatement();
            rs=statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("empid")+ " ");
                System.out.print(rs.getString("name")+ " ");
                System.out.println(rs.getString("address")+ " ");

            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
    public void update_name(Connection conn, String table_name, String old_name, String new_name){
       Statement statement;

        try{
            String query = String.format("update %s set name='%s' where name='%s'",table_name,new_name,old_name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated!");

        }catch(Exception e){
            System.out.println(e);
        }


    }
    public void search_by_name(Connection conn, String table_name, String name){
        Statement statement;
        ResultSet rs = null;
        try{
            String query=String.format("select * from %s where name= '%s'",table_name,name);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("address"));

            }


        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void search_by_id(Connection conn, String table_name, int id){
        Statement statement;
        ResultSet rs = null;
        try{
            String query=String.format("select * from %s where empid= %d",table_name,id);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("address"));

            }


        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void delete_value(Connection conn,String table_name, String name){
        Statement statement;
        try{
            String query=String.format("delete from %s where name='%s'",table_name,name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Deleted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void delete_id(Connection conn,String table_name, int id){
        Statement statement;
        try{
            String query=String.format("delete from %s where empid=%d",table_name,id);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Deleted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
