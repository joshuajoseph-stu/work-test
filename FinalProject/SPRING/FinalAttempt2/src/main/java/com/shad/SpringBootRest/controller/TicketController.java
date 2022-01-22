package com.shad.SpringBootRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringBootRest.entity.Ticket;
import com.shad.SpringBootRest.service.TicketService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api")
@RestController
public class TicketController {
	
	@Autowired 
	private TicketService ticketService;
	
	@PostMapping("/ticket")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.saveTicket(ticket);

	}

	@PutMapping("/ticket")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketService.updateTicket(ticket);

	}

	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable int ticketId) {
		ticketService.deleteTicket(ticketId);

	}

	@GetMapping("/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable int ticketId) {
		return ticketService.getTicketById(ticketId);

	}

	@GetMapping("/ticket")
	public List<Ticket> getAllTicket() {
		return ticketService.getAllTicket();
	}

}

	
