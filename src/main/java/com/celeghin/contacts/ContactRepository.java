package com.celeghin.contacts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Repository Interface
 */

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
