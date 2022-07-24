package com.jk.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.jk.spring.mysql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
