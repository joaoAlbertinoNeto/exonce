package br.com.ms.exconce.application.port.in.rest;

import br.com.ms.exconce.domain.rest.CustomerTicketResquest;

public interface CustomerTicketInputPortIn {
	public String createCustomerTicket(CustomerTicketResquest customerTicketResquest);

}
