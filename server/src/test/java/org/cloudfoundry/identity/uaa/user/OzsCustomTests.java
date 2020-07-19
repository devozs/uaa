package org.cloudfoundry.identity.uaa.user;

import org.cloudfoundry.identity.uaa.annotations.WithDatabaseContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@WithDatabaseContext
class OzsCustomTests {


    @BeforeEach
    void setUp() {


    }
    @Test
    void storeUserInfoWithoutId() {
        System.out.println("Ozs message OzsCustomTests");

        OzsCustomHandler handler = new OzsCustomHandler();
        assertTrue(handler.touchMe());
    }

}
