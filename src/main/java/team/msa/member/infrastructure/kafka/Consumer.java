package team.msa.member.infrastructure.kafka;


import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private final Logger logger = (Logger) LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "kafka_practice", groupId = "group_id_kafka")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}