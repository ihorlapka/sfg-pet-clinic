package guru.springframework.sfgpetclinic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SfgPetClinicApplicationTests {

    @Test
    void contextLoads() {

        log.info("some comment1");
        log.info("some comment2");
    }

}
