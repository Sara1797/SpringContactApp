package com.mycompany.capp.service;

import com.mycompany.capp.domain.Contact;
import java.util.List;

/**
 *
 * @author manish
 */
public interface ContactService {
  public void save(Contact c);
  public void update(Contact c);
  public void delete(Integer contactId);
  public void delete(Integer[] contactIds);
  /**
   * This method returns all user contacts
   * @param userId
   * @return 
   */
  public List<Contact> findUserContact(Integer userId);
  /**
   * This method search contact for user(userId) based on given free-text-criteria(txt)
   * @param userId
   * @param txt criteria used to search - free text search criteria
   * @return 
   */
  public List<Contact> findUserContact(Integer userId,String txt);
}
