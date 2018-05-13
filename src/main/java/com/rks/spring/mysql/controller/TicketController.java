package com.rks.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rks.spring.mysql.dao.TicketDao;
import com.rks.spring.mysql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.saveAll(tickets);
		return "Tickets booked :  " + tickets.size();

	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}

}
