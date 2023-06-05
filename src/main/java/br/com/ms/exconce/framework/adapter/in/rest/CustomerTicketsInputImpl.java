package br.com.ms.exconce.framework.adapter.in.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.exconce.application.port.in.rest.CustomerTicketInputPortIn;
import br.com.ms.exconce.application.service.HandleSendCustomerTicketsUseCase;
import br.com.ms.exconce.domain.rest.CustomerTicketResquest;


@RestController
public class CustomerTicketsInputImpl implements CustomerTicketInputPortIn{

	@Autowired
	private HandleSendCustomerTicketsUseCase handleSendCustomerTicketsUseCase;
	
	@PostMapping(path = "create")
	@Override
	public String createCustomerTicket(@RequestBody CustomerTicketResquest customerTicketResquest) {
		handleSendCustomerTicketsUseCase.sendCustomerTickets(customerTicketResquest);
		return null;
	}

}
