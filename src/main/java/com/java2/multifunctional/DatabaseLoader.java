//package com.java2.multifunctional;
//
//import com.java2.multifunctional.entities.Image;
//import com.java2.multifunctional.services.ImageService;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseLoader implements CommandLineRunner {
//
//    private final org.slf4j.Logger logger = LoggerFactory.getLogger(DatabaseLoader.class);
//    private ImageService imageService;
//
//    public DatabaseLoader(ImageService imageService) {
//        this.imageService = imageService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("Loading data from DatabaseLoader....");
//
//        imageService.save(new Image("Image 1"));
//        imageService.save(new Image("Image 2"));
//        imageService.save(new Image("Image 3"));
//    }
//}
