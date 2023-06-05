package br.com.ms.exconce.framework.kafka.out;

import java.util.Random;
import java.util.UUID;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.ms.exconce.application.port.out.CustomerTicketPortOut;
import br.com.ms.exconce.domain.kafka.CustomerTicketEvent;

@Component
public class CustomerTicketKafkaOutImpl implements CustomerTicketPortOut {
	
	@Value("topic.name")
	private String topicName;

	@Autowired
	private KafkaTemplate<String,String> template; 
	
	
	@Override
	public void sendTicket(CustomerTicketEvent customerTicketEvent) throws Exception {
		 System.out.println("BEGIN SEND EVENT ==========================================>");
		 System.out.println(customerTicketEvent.toString());
		 template.send(createRecord(customerTicketEvent));
		 System.out.println("<=========================================== END SEND EVENT");
	}
	
	
	private ProducerRecord<String, String> createRecord(CustomerTicketEvent customerTicketEvent){
		return new ProducerRecord<String, String>(topicName, customerTicketEvent.toString());
	}

}
