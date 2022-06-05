package com.wallet.models.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wallet.models.entities.Wallet;


public interface WalletRepository extends CrudRepository<Wallet, Long> {
    List<Wallet> findByNameContains(String name);
}
