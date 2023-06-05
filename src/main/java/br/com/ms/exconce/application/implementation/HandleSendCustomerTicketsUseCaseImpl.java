package br.com.ms.exconce.application.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ms.exconce.application.port.out.CustomerTicketPortOut;
import br.com.ms.exconce.application.service.HandleSendCustomerTicketsUseCase;
import br.com.ms.exconce.domain.kafka.CustomerTicketEvent;
import br.com.ms.exconce.domain.rest.CustomerTicketResquest;

@Component
public class HandleSendCustomerTicketsUseCaseImpl implements HandleSendCustomerTicketsUseCase {

	@Autowired
	private CustomerTicketPortOut customerTicketPortOut;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public void sendCustomerTickets(CustomerTicketResquest customerTicketResquest) {
		System.out.println("BEGIN HANDLE =========================================>");
		System.out.println("RECEIVED OBJECT:"+customerTicketResquest.toString());
		
		System.out.println("MAPPING TO EVENT OBJ....");
		CustomerTicketEvent event = mapper.map(customerTicketResquest, CustomerTicketEvent.class);
		try {
			customerTicketPortOut.sendTicket(event);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("<========================================= END HANDLE");
		
	}

}
