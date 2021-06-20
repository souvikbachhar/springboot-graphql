package com.souvik.app.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.souvik.app.entity.BankAccount;
import com.souvik.app.repo.BankRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BankAccountResolver implements GraphQLQueryResolver{
	
	@Autowired
	BankRepository bankRepository;
	
	public BankAccount bankAccount(String id) {
		return bankRepository.findById(id).get();
	}
	
	public List<BankAccount> allBankAccounts() {
		return bankRepository.findAll();
	}
}
