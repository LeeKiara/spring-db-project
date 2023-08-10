package com.lhm.ipms.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactActivityRepository extends JpaRepository<ContactActivity, Long> {
}
