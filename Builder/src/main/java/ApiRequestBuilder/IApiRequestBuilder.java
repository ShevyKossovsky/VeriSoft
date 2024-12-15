package ApiRequestBuilder;

import java.util.Map;

/**
 * Interface representing the builder pattern for constructing an API request.
 * This interface defines the required methods for constructing different parts
 * of an API request such as the URL, HTTP method, headers, parameters, and body.
 */
public interface IApiRequestBuilder {

    /**
     * Method to set the URL for the API request.
     *
     * @param url The URL to be used for the request.
     */
    void buildURL(String url);

    /**
     * Method to set the HTTP method (e.g., GET, POST) for the API request.
     *
     * @param method The HTTP method type.
     */
    void buildMethod(String method);

    /**
     * Method to set the request headers.
     *
     * @param headers A map containing key-value pairs for the headers.
     */
    void buildHeader(Map<String, String> headers);

    /**
     * Method to set the query or body parameters for the API request.
     *
     * @param parameters A map containing key-value pairs for the parameters.
     */
    void buildParameter(Map<String, String> parameters);

    /**
     * Method to set the body content for the API request (typically for POST or PUT).
     *
     * @param body The body of the request, usually a JSON string.
     */
    void buildBody(String body);
}
