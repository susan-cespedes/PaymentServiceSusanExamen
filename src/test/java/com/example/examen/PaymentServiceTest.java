package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void processPayment() {
        // Configuración (Arrange)
        PaymentService paymentService = new PaymentService();
        PaymentRequestDto validRequest = new PaymentRequestDto("4111111111111111", "123", "12/25", 100);

        // Acción (Act)
        boolean result = paymentService.processPayment(validRequest);

        // Verificación (Assert)
        assertTrue(result, "The payment should be processed successfully");
    }

    }
