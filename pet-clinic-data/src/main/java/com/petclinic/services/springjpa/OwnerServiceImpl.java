package com.petclinic.services.springjpa;

import com.petclinic.model.Owner;
import com.petclinic.repositries.OwnerRepository;
import com.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile({"default","springjpa"})
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner>owners=new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);

    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);

    }

    @Override
    public Owner finByLastName(String lastName) {
        return ownerRepository.finByLastName(lastName).get();
    }
}
