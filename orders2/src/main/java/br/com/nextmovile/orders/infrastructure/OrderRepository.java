package br.com.nextmovile.orders.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.nextmovile.orders.domain.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
