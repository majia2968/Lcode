package com.agile.practice.mockito.test;

import com.agile.practice.mockito.main.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.easymock.EasyMock.replay;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class PowerMockUserTests {

    @Test
    public void testGetPrivate() throws Exception {
        UserService test = PowerMock.createPartialMock(UserService.class, "isEmpty");
        PowerMock.expectPrivate(test, "isEmpty").andReturn(true);
        replay(test);
    }
}
