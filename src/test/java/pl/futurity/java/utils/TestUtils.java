package pl.futurity.java.utils;

import com.google.inject.*;
import pl.futurity.java.DefaultDataProvider;
import pl.futurity.java.Provider;
import pl.futurity.java.RawDataProvider;

public class TestUtils extends AbstractModule {

    @Inject
    private ParametersProvider parametersProvider;

    protected void configure() {

        Module module = new TestParameters();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(this);

        if (parametersProvider.get("dataProviderType").equals("raw")) {
            bind(Provider.class).to(RawDataProvider.class);
        } else {
            bind(Provider.class).to(DefaultDataProvider.class);
        }
    }
}
