package com.ecommerce.orderservice.exception;

public class InventoryUnavailableException extends RuntimeException {
    public InventoryUnavailableException(String message) {
        super(message);
    }
}
