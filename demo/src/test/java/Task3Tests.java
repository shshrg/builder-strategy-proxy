import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.ucu.edu.apps.task3.ProxyImage;

public class Task3Tests {

    @Test
    public void testProxyImageInitialization() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        // Initially, the realImage should be null
        assertNull(proxyImage.getRealImage());
    }

    @Test
    public void testProxyImageDisplay() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        // Display the image, which should initialize the realImage
        proxyImage.display();

        // Now, the realImage should not be null
        assertNotNull(proxyImage.getRealImage());
    }
}