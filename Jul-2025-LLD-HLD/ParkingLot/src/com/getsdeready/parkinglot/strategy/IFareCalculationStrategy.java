package com.getsdeready.parkinglot.strategy;

import com.getsdeready.parkinglot.model.Ticket;

public interface IFareCalculationStrategy {
    Double calculateFare(Ticket ticket);
}
