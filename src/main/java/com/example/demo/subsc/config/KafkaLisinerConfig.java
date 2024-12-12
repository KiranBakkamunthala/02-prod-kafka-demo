/*
 * package com.example.demo.subsc.config;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import org.apache.kafka.clients.consumer.ConsumerConfig; import
 * org.apache.kafka.common.serialization.StringDeserializer;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.kafka.annotation.EnableKafka; import
 * org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
 * import org.springframework.kafka.core.ConsumerFactory; import
 * org.springframework.kafka.core.DefaultKafkaConsumerFactory; import
 * org.springframework.kafka.support.serializer.JsonDeserializer;
 * 
 * import com.example.demo.subsc.constant.KafkaSubscConstant; import
 * com.example.demo.subsc.entiry.Customer;
 * 
 * @Configuration
 * 
 * @EnableKafka public class KafkaLisinerConfig {
 * 
 * @Bean public ConsumerFactory<String, Customer> productFactory() { Map<String,
 * Object> props = new HashMap<String, Object>();
 * props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaSubscConstant.HOST);
 * props.put(ConsumerConfig.GROUP_ID_CONFIG, KafkaSubscConstant.GROUP_ID);
 * props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
 * StringDeserializer.class);
 * props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
 * JsonDeserializer.class); return new DefaultKafkaConsumerFactory<>(props, new
 * StringDeserializer(), new JsonDeserializer<>()); }
 * 
 * @Bean public ConcurrentKafkaListenerContainerFactory<String, Customer>
 * kafkaListenerContainerFactory() {
 * ConcurrentKafkaListenerContainerFactory<String, Customer> factory = new
 * ConcurrentKafkaListenerContainerFactory<>();
 * factory.setConsumerFactory(productFactory()); return factory; } }
 */