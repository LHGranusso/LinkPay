import com.linkpay.service.carteiraService;

import com.linkpay.model.carteira;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class carteiraServiceTest {

    private carteiraService service;

    @BeforeEach
    void setUp() {
        service = new carteiraService();
        service.carteiras = new ArrayList<>();
    }

    @Test
    void shouldAddValueToExistingCarteira() {
        // Arrange
        carteira existingCarteira = new carteira();
        existingCarteira.setId(1);
        existingCarteira.setSaldo(new BigDecimal("100.00"));
        service.carteiras.add(existingCarteira);

        BigDecimal valorToAdd = new BigDecimal("50.00");

        // Act
        boolean result = service.addCarteira(1, valorToAdd);

        // Assert
        assertTrue(result);
        assertEquals(new BigDecimal("150.00"), existingCarteira.getSaldo());
    }
}