package com.docfin.platform.repository;

import com.docfin.platform.model.Country;
import com.docfin.platform.model.State;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amit on 8/16/16.
 */
@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long>{
}
