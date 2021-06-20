package com.souvik.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souvik.app.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, String>{

}
