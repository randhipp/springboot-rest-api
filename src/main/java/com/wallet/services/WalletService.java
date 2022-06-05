package com.wallet.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.models.entities.Wallet;
import com.wallet.models.repositories.WalletRepository;

@Service
@Transactional
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public Wallet create(Wallet wallet) {
        return walletRepository.save(wallet);
    }
    
    public Wallet findOne(Long id) {
        Optional<Wallet> wallet = walletRepository.findById(id);
        if (!wallet.isPresent()) {
            return null;
        }
        return wallet.get();
    }

    public Iterable<Wallet> findAll() {
        return walletRepository.findAll();
    }

    public void removeOne(Long id) {
        walletRepository.deleteById(id);
    }

    public List<Wallet> findByName(String name) {
        return walletRepository.findByNameContains(name);
    }
}
