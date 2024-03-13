package br.com.arielsonsantos.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arielsonsantos.accounts.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, String> {
}