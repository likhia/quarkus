package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeSimpleRestServiceIT extends SimpleRestServiceTest {

    // Execute the same tests but in native mode.
}