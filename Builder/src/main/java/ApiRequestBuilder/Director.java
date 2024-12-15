package ApiRequestBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * The Director class is responsible for constructing an API request
 * using the builder pattern. It delegates the task of constructing
 * the request to the IApiRequestBuilder.
 */
public class Director {

    private IApiRequestBuilder builder;

    /**
     * Constructor for the Director class.
     * @param builder The IApiRequestBuilder instance used to construct the API request.
     */
    public Director(IApiRequestBuilder builder) {
        this.builder = builder;
    }

    /**
     * Builds the complete API request using the builder methods.
     * It sets the URL, method, headers, parameters, and body for the API request.
     */
    public void buildApiRequest() {

        builder.buildURL("https://api.example.com/endpoint");
        builder.buildMethod("GET");
        builder.buildHeader(new HashMap<>(Map.of(
                "Content-Type", "application/json"
        )));

        builder.buildParameter(Map.of(
                "to", "recipient@example.com",
                "subject", "Test Email",
                "body", "This is a test email body"
        ));

        builder.buildBody("{\"key\": \"value\"}");
    }
}
