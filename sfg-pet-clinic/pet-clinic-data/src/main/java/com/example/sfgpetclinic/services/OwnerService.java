package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    String findByLastName(String lastName);

    Owner findById(Owner owner);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
