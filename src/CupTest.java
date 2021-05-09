

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice",86.2);
        assertEquals("Orange Juice",c.getLiquidType());
    }
    @Test
    void getPercentageFull() {
        Cup c = new Cup("Cranberry Juice",86.2);
        assertEquals(86.2,c.getPercentFull(),0.001);
    }

    @Test
    void testSetLiquidType() {
        Cup c = new Cup("Cranberry Juice",86.2);
        c.setLiquidType("Cran");
        assertEquals("Cran","Cran");
    }

    @Test
    void setPercentageFull(){
        Cup c = new Cup("Rasberry Juice",72.1);
        c.setPercentFull("Robin");
        assertEquals(assert,32);
    }
}