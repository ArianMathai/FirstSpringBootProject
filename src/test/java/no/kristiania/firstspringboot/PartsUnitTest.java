package no.kristiania.firstspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PartsUnitTest {

    @MockBean
    private PartsRepository partsRepository;

    @Autowired
    private PartsService partsService;
    @Test
    void shouldRetrieveValueFromRepo(){
        PartsRepository partsRepository = new PartsRepository();

        assertThat(partsRepository.getParts().size()).isEqualTo(3);
    }

    @Test
    void addingNewPartShouldIncreaseArraySize(){
        PartsRepository partsRepository = new PartsRepository();

        partsRepository.addParts(new Part("loyd"));
        assertThat(partsRepository.getParts().size()).isEqualTo(4);
    }

    @Test
    void shouldGetPartsFromService(){

        ArrayList<Part> partsList = new ArrayList<>(List.of(new Part("pogo")));

        when(partsRepository.getParts()).thenReturn(partsList);
    }
    @Test
    void deletingPartShouldDecreaseArraySize(){
        PartsRepository pr = new PartsRepository();

        pr.deletePart(new Part("cog"));
        assertThat(pr.getParts().size()).isEqualTo(2);
    }
}
