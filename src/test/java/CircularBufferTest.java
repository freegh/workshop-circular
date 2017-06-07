import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {

    @Test
    public void bufferว่างตอนสร้างใหม่() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);

        assertTrue("ต้องว่าง", buffer.isEmpty());
    }

    @Test
    public void bufferไม่ว่างเมื่อเพิ่ใข้อมูลหนึ่งตัว() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");

        assertFalse("ต้องไม่ว่าง", buffer.isEmpty());
    }

    @Test
    public void bufferว่างเมื่อเพิ่มและลบ() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");
        buffer.remove();

        assertTrue("ไม่ว่าง", buffer.isEmpty());
    }

    @Test
    public void เมื่อเพิ่มและลบ() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");
        String result = buffer.remove();

        assertEquals("A", result);
    }

    @Test
    public void เมื่อเพิ่มและลบ2() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");
        buffer.push("B");

        assertEquals("A", buffer.remove());
        assertEquals("B", buffer.remove());
    }

    @Test
    public void เมื่อเพิ่มและลบ3() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");
        buffer.push("B");
        buffer.push("C");

        assertEquals("A", buffer.remove());
        assertEquals("B", buffer.remove());
        assertEquals("C", buffer.remove());
    }

    @Test
    public void เมื่อเพิ่มและลบ4() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);
        buffer.push("A");
        buffer.remove();
        buffer.push("B");
        buffer.push("C");
        buffer.remove();
        buffer.remove();

        assertTrue("ต้องว่าง", buffer.isEmpty());
    }

    @Test
    public void สร้างbufferใหม่ขนาด7() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.setSize(7);

        //Assert
        assertEquals(7, buffer.getSize());
    }

}
