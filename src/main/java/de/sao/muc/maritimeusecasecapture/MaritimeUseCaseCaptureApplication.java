package de.sao.muc.maritimeusecasecapture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class MaritimeUseCaseCaptureApplication {

    private static final Logger log = LoggerFactory.getLogger(MaritimeUseCaseCaptureApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(MaritimeUseCaseCaptureApplication.class);
        ConfigurableApplicationContext cac = app.run(args);
        Environment env = cac.getEnvironment();
        String protocol = env.getProperty("server.ssl.key-store") == null ? "http" : "https";
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application is running! Access URLs:\n\t" +
                        "Local: \t\t{}://localhost:{}\n\t" +
                        "Swagger UI: {}://localhost:{}/swagger-ui.html\n\t" +
                        "Profile(s): \t{}\n----------------------------------------------------------",
                protocol,
                env.getProperty("server.port"),

                protocol,
                env.getProperty("server.port"),

                env.getActiveProfiles());


    }
}
