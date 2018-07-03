package core;

import java.sql.*;

public class Database {
    
    private Connection conn = null;
    private Statement stmt = null;
    
    final private String db_name = "elections";
    final private String db_user = "root";
    final private String db_pass = "mfe6174";
    
    private boolean bootConnection(){
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/"+this.db_name, this.db_user, this.db_pass);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public Statement getStatement(){
        if (this.bootConnection()){
            try {
                this.stmt = this.conn.createStatement();
                return stmt;
            } catch (SQLException e) {
               new Repo().log(e.getMessage());
            }
        }
        return null;
    }
    
    public boolean closeConnection(){
        try {
            this.stmt.close();
            this.conn.close();
            return true;
        } catch (Exception e){
            new Repo().log(e.getMessage());
            return false;
        }
    }
    
    public int getSize(ResultSet rs){
        int size = 0;
        try {
            rs.last();
            size = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e){
            new Repo().log(e.getMessage());
        }
        return size;
    }
    
    public static void main (String args[]){
          Database db = new Database();
          db.bootConnection();
          try{
               Statement stmt = db.getStatement();
               for (int i = 0; i <= 500; i++){
                   
               }
          } catch (Exception e){
              new Repo().log(e.getMessage());
          }
    }
   
    
}