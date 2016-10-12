package business;

import java.util.HashMap;

import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;
	
	@Override
	public void login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if(!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if(!passwordFound.equals(password)) {
			throw new LoginException("Passord does not match password on record");
		}
		currentAuth = map.get(id).getAuthorization();
		
	}
	
	@Override
	public Book searchBook(String isbn) {
		DataAccess da = new DataAccessFacade();
		return da.searchBook(isbn);
	}
		
	
	public boolean addBookCopy(String isbn) throws LibrarySystemException {
		Book book = searchBook(isbn);
		if(book == null) throw new LibrarySystemException("No book with isbn " + isbn 
			+ " is in the library collection!");
		book.addCopy();
		return true;
	}
	
	@Override
	public void checkoutBook(String memberId, String isbn)
			throws LibrarySystemException {
		// TODO Auto-generated method stub
		
	}
	
}
