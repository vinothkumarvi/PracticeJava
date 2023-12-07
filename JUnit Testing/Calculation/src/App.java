import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int Add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {

        return a / b;
    }

    @Test
    public void TestAdd() {

        assertEquals("ok", 100, Add(50, 30));

    }

    private void assertEquals(String string, int i, int add) {
    }

    @Test
    public void TestSub() {

        assertEquals("ok", 20, sub(70, 50));
    }

    @Test
    public void multiply() {

        assertEquals("ok", 150, multiply(3, 50));

    }

    @Test
    public void divide() {

        assertEquals("ok", 10, divide(500, 50));

    }
}
