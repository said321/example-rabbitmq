package me.said.example_rabbitmq;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Publisher{
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException{
		ConnectionFactory factory = new ConnectionFactory();
		//factory.setUri("amqp://guest:guest@ip172-18-0-43-bl2quat35dvg00du71r0.direct.labs.play-with-docker.com");
		factory.setHost("ip172-18-0-43-bl2quat35dvg00du71r0.direct.labs.play-with-docker.com");
		factory.setConnectionTimeout(300000);
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare("my-queue", true, false, false, null);
		int count = 0;
		while(count<10){
			String message = "Message number " + count;
			channel.basicPublish("", "my-queue", null, message.getBytes());
			count++;
			System.out.println("Published message : " + message);
		}
	}
}
