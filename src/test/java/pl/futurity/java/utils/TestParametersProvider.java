package pl.futurity.java.utils;

import com.google.inject.Inject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class TestParametersProvider implements ParametersProvider {

    private Properties properties;

    @Inject
    public TestParametersProvider() {
        properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test.properties");
        if (inputStream != null) {
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}
