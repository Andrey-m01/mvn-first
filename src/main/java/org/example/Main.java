package org.example;

import com.google.gson.Gson;
import org.apache.log4j.BasicConfigurator;
import org.example.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        BasicConfigurator.configure();
        String cur = "{\n"
                + "    \"name\": \"Igor\",\n"
                + "    \"lastName\": \"Petrenko\"\n"
                + "}";
        UserDTO item = new Gson().fromJson(cur, UserDTO.class);
        item.log();
        LOGGER.info("the end");
    }
}