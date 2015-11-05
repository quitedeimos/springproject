package by.kuznetsov.springproject.service;

import java.util.List;
import by.kuznetsov.springproject.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
