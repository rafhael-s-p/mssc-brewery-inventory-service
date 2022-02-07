package com.studies.beer.inventory.service.services;

import com.studies.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

}
