package patrick.math.orderConsumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patrick.math.orderConsumer.model.Orders;
import patrick.math.orderConsumer.repository.OrderRepository;

@Service
public class OrderProcessorService {

    @Autowired
    private OrderRepository orderRepository;

    @RabbitListener(queues = "ordersQueue")
    public void receive(Orders orders) {
        orderRepository.save(orders); // Save the order to the database
        System.out.println(orders.getFirst_name() + " " + orders.getMiddle_name() + ", your order with OrderId: " + orders.getOrder_id() + ", has been consumed in batch and saved to the database successfully.");
    }
}




