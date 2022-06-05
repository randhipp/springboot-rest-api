package com.wallet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.models.entities.Wallet;
import com.wallet.services.WalletService;

@RestController
@RequestMapping("/api/wallets")
public class WalletController {
    @Autowired
    private WalletService walletService;
    
    @PostMapping
    public Wallet create(@RequestBody Wallet wallet) {
        return walletService.create(wallet);
    }

    @GetMapping
    public Iterable<Wallet> findAll() {
        return walletService.findAll();
    }

    @GetMapping("/{id}")
    public Wallet findOne(@PathVariable("id") Long id) {
        return walletService.findOne(id);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        walletService.removeOne(id);
    }
    
}
