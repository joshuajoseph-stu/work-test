package com.shad.SpringBootRest.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBootRest.entity.Ticket;
import com.shad.SpringBootRest.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;
	
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	
	public Ticket updateTicket(Ticket ticket) {
		return ticketRepository.save(ticket);

	}

	public void deleteTicket(int ticketId) {
		ticketRepository.deleteById(ticketId);

	}

	public Optional<Ticket> getTicketById(int ticketId) {
	return	ticketRepository.findById(ticketId);

	}

	public List<Ticket> getAllTicket() {
		return ticketRepository.findAll();

	}

}
