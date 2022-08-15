package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {

    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Initialize.class);
    }
}

@SpringBootApplication
class Initialize {
}

@RestController
class Sample {

    @RequestMapping("/square-area")
    // http://localhost:3000/square-area?width=5&height=10  ====> 25.0
    double showSquareArea(double width, double height) {
        if (width < height) {
            return width * width;
        } else {
            return height * height;
        }
    }
}
