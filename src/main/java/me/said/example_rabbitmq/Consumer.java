package me.said.example_rabbitmq;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Delivery;

public class Consumer {
//	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException{
//		ConnectionFactory factory = new ConnectionFactory();
//		//factory.setUri("amqp://guest:guest@ip172-18-0-34-bl2nf4d35dvg008qsu9g-5671.direct.labs.play-with-docker.com");
//		factory.setHost("http://ip172-18-0-43-bl2quat35dvg00du71r0-5672.direct.labs.play-with-docker.com");
//		factory.setConnectionTimeout(300000);
//		Connection connection = factory.newConnection();
//		Channel channel = connection.createChannel();
//		channel.queueDeclare("my-queue", true, false, false, null);
//		Delivery delivery = new de
//		com.rabbitmq.client.Consumer consumer 
//		channel.basicConsume("my-queue", false, consumer);
//		while(true) {
//			Delivery delivery = consumer.nextDelivery();
//		}
//	}
}
