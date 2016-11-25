package pl.futurity.java.utils;

import com.google.inject.AbstractModule;

public class TestParameters extends AbstractModule {

    protected void configure() {
        bind(ParametersProvider.class).to(TestParametersProvider.class);
    }
}
