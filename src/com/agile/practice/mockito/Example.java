package com.agile.practice.mockito;

import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.List;

public class Example {

    @Test
    public void testExample() {
        List mockedList = mock(List.class);

        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
