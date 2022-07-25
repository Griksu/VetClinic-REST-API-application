package com.crud.vetclinicback.repository;

import com.crud.vetclinicback.model.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    List<Owner> findAll();
}
