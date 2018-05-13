package com.rks.spring.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.rks.spring.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
