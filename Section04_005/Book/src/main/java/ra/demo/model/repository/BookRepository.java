package ra.demo.model.repository;

import ra.demo.Database.BookDB;
import untils.Book;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Book> bookList = null;

        try{
            conn=BookDB.openConnection();
            callSt =conn.prepareCall("{call find_all()}");
            ResultSet rs = callSt.executeQuery();
            bookList=new ArrayList<>();
            while(rs.next()){
                Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setAuthor(String.valueOf(rs.getDouble("price")));
                book.setDescription(rs.getString("description"));
                bookList.add(book);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BookDB.closeConnection(conn,callSt);
        }
        return bookList;
    }
}
