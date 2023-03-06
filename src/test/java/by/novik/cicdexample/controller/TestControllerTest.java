package by.novik.cicdexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(TestController.class)
//мокает рестовские ендпоинты
        //хотим протестировать гет маппинг путем тест/ отправляет тест и на сервис
class TestControllerTest {
    @Autowired
    private  MockMvc mockMvc;
    @Test
    void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/test"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello bro"));
    }
}