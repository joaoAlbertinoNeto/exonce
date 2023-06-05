package br.com.ms.exconce.application.service;

import br.com.ms.exconce.domain.rest.CustomerTicketResquest;

public interface HandleSendCustomerTicketsUseCase {
	
	public void sendCustomerTickets(CustomerTicketResquest customerTicketResquest);

}
