package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Vet vet);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
