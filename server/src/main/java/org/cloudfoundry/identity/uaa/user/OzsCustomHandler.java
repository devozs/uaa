package org.cloudfoundry.identity.uaa.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OzsCustomHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    public boolean touchMe(){
        logger.debug("Ozs message OzsCustomHandler");
        System.out.println("Ozs message OzsCustomHandler");
        return true;
    }

}
