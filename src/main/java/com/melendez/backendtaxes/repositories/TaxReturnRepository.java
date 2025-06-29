package com.melendez.backendtaxes.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.melendez.backendtaxes.models.TaxReturn;

public interface TaxReturnRepository extends MongoRepository<TaxReturn, String>{
    // Return one return that matches the email
    Optional<TaxReturn> findByEmail(String email);
}
