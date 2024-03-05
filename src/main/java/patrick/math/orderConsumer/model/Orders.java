package patrick.math.orderConsumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L; // making this class Serializable for Spring AMQP's RabbitTemplate
    @Id
    private String order_id;
    private String order_items;
    private String first_name;
    private String middle_name;
    private String order_status;

    private String param_one;
    private String param_two;

    // Constructors, getters, and setters
    public Orders() {
    }

    public Orders(String order_id, String order_items, String first_name, String middle_name,
                       String order_status, String param_one, String param_two) {
        this.order_id = order_id;
        this.order_items = order_items;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.order_status = order_status;
        this.param_one = param_one;
        this.param_two = param_two;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_items() {
        return order_items;
    }

    public void setOrder_items(String order_items) {
        this.order_items = order_items;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getParam_one() {
        return param_one;
    }

    public void setParam_one(String param_one) {
        this.param_one = param_one;
    }

    public String getParam_two() {
        return param_two;
    }

    public void setParam_two(String param_two) {
        this.param_two = param_two;
    }
}




