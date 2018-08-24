package com.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connecctions.MyConnection;
import com.dao.BookDAO;

public class BookDAOImpl implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		
		try {
			String INSERT_BOOK = "INSERT INTO BOOKS VALUES(?,?,?,?)";
			PreparedStatement st = MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			st.setString(1, book.getIsbn());
			st.setString(2, book.getName());
			st.setString(3, book.getPublication());
			st.setString(4, book.getAuthor());
			
			if(st.executeUpdate() > 0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public int updateBook(Book book, String Isbn) {
		// TODO Auto-generated method stub
		
		String UPDATE_BOOK = "UPDATE BOOKS SET PUBLICATION = ? WHERE ISBN = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			ps.setString(1, book.getPublication());
			ps.setString(2, Isbn);
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return 0;
	}

	@Override
	public int deleteBook(String Isbn) {
		// TODO Auto-generated method stub
		
		String DELETE_BOOK = "DELETE FROM BOOKS WHERE ISBN = ? ";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(DELETE_BOOK);
			ps.setString(1, Isbn);
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Book findBookByISBN(String Isbn) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		String FIND_BOOK = "SELECT * FROM BOOKS WHERE ISBN = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOK);
			ps.setString(1, Isbn);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				b = new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public List<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList<>();
		
		String FIND_BOOKS = "SELECT * FROM BOOKS WHERE NAME = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOKS);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				books.add(new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return books;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		
		String FIND_BOOKS = "SELECT * FROM BOOKS";
		try {
			Statement ps = MyConnection.getMyConnection().createStatement();
			
			ResultSet rs = ps.executeQuery(FIND_BOOKS);
			while(rs.next()) {
				books.add(new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		return books;
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList<>();
		
		String FIND_BOOKS = "SELECT * FROM BOOKS WHERE AUTHOR = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOKS);
			ps.setString(1, auth_name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				books.add(new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return books;
	}

}
