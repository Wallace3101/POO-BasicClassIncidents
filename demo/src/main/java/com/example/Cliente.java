package com.example;

public class Cliente {
    String nombre;
    String dni;
    String direccion;

    String realizarPedido() {
        return "Realizar pedido";
    }
    
    String cancelarPedido() {
        return "Cancelar pedido";
    }
    
    String realizarPago() {
        return "Realizar pago";
    }
}
