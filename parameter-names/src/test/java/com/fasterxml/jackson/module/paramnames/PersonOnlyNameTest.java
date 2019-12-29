package com.fasterxml.jackson.module.paramnames;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class PersonOnlyNameTest
{
    @Test
    public void shouldBeAbleToDeserializePersonOnlyName() throws IOException
    {
        // given
        ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new ParameterNamesModule());

        // Fails with com.fasterxml.jackson.databind.exc.MismatchedInputException
        objectMapper.readValue("{\"name\":\"joe\"}", PersonOnlyName.class);
    }
}
