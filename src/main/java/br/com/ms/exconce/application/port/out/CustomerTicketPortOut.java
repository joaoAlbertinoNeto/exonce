package br.com.ms.exconce.application.port.out;

import br.com.ms.exconce.domain.kafka.CustomerTicketEvent;

public interface CustomerTicketPortOut {
	public void sendTicket(CustomerTicketEvent customerTicketEvent) throws Exception;
}
