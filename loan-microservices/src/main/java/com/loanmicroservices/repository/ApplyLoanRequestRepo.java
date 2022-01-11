package com.loanmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanmicroservices.entity.ApplyLoanRequest;

@Repository
public interface ApplyLoanRequestRepo extends JpaRepository<ApplyLoanRequest, Integer> {

}
