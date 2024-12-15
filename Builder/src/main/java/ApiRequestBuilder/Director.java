package ApiRequestBuilder;

import java.util.HashMap;

public class Director {
    private ApiRequestBuilder builder;

    public Director(ApiRequestBuilder builder) {
        this.builder = builder;
    }
    public void buildApiRequest() {
        //change set to build
        builder.buildURL("https://api.example.com/endpoint");
        builder.buildMethod("GET");
        builder.buildHeader(new HashMap<>("Content-Type", "application/json"));
        builder.buildParameter("param1", "value1");
        builder.buildBody("{\"key\": \"value\"}");
    }

}
