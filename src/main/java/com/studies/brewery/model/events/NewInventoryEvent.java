package com.studies.brewery.model.events;

import com.studies.brewery.model.events.BeerDto;
import com.studies.brewery.model.events.BeerEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }

}
