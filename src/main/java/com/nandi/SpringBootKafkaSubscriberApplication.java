package com.nandi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.nandi.constants.AppConstant;

@SpringBootApplication
public class SpringBootKafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaSubscriberApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstant.TOPIC, groupId="group_ashokit_order")
	public void subscribeMsg(String order) {
		System.out.print("*** Msg Recieved From Kafka *** :: ");
		System.out.println(order);
		//logic
	
}

}
