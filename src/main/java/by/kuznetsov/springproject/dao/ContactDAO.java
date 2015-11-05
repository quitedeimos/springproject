package by.kuznetsov.springproject.dao;

import java.util.List;
import by.kuznetsov.springproject.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
