package com.ironyard.repositories;

import com.ironyard.data.costume;
import org.springframework.data.repository.CrudRepository;

/**
 * Means we will be dealing with 'costume' objects and their primary
 * key will be of type 'Long' aka long
 * CrudRepository<costume, Long>
 */

public interface  HalloweenRepository extends CrudRepository<costume, Long> {
}
