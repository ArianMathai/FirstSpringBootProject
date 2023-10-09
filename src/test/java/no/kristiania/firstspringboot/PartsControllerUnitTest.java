package no.kristiania.firstspringboot;

import no.kristiania.firstspringboot.Part;
import no.kristiania.firstspringboot.PartsController;
import no.kristiania.firstspringboot.PartsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class PartsControllerUnitTest {

    @MockBean
    private PartsService partsService;

    @Autowired
    private PartsController partsController;

    @Test
    void shouldReturnResult(){
        ArrayList<Part> partsList = new ArrayList<>(List.of(new Part("bum")));

        when(partsService.getParts()).thenReturn(partsList);

        assertThat(partsController.getParts().getBody().get(0).name()).isEqualTo("bum");
    }

}