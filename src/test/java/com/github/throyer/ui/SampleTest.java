package com.github.throyer.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@Tag("Unit")
@ExtendWith(MockitoExtension.class)
public class SampleTest {
  @Test
  public void um_teste_bem_confiavel() throws Exception {
    Assertions.assertTrue(true);
  }
}
