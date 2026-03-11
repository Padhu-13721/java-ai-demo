import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestExample {

    private static final Logger logger = LogManager.getLogger(TestExample.class);

    public static void main(String[] args) {

        String username = "admin";

        logger.info("User logged in: " + username);

        System.out.println("Program executed");

    }

}
