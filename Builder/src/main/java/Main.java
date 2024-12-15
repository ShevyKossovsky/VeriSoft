import ApiRequestBuilder.ApiRequest;
import ApiRequestBuilder.ApiRequestBuilder;
import ApiRequestBuilder.*;

/**
 * Main class to demonstrate the use of the Builder Pattern for building an API request.
 * This class utilizes the Director class to guide the construction of an ApiRequest
 * using an instance of the ApiRequestBuilder.
 */
public class Main {
    public static void main(String[] args) {

        // Instantiate the builder for API request construction
        IApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();

        // Instantiate the director, which will orchestrate the building process
        Director director = new Director(apiRequestBuilder);

        // Trigger the building process of the API request through the director
        director.buildApiRequest();
    }
}
