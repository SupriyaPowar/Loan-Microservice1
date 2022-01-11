package com.loanmicroservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanmicroservices.entity.ApplyLoanRequest;
import com.loanmicroservices.repository.ApplyLoanRequestRepo;

@Service
public class ApplyLoanRequestServices {

	@Autowired
	ApplyLoanRequestRepo loanreq;

	public void addLoan(ApplyLoanRequest request) {

		loanreq.save(request);
	}

	public void updateLoan(ApplyLoanRequest request) {

		loanreq.save(request);
	}

	public void deleteLoan(int loan_id) {

		loanreq.deleteById(loan_id);
	}

	public Optional<ApplyLoanRequest> getLoanById(int loan_id) {

		return loanreq.findById(loan_id);
	}

	public List<ApplyLoanRequest> getAllLoan() {

		return loanreq.findAll();
	}
}
