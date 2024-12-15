package ApiRequestBuilder;

import java.util.Map;

/**
 * Represents an API request object with details for making HTTP requests.
 */
public class ApiRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;


    public ApiRequest() {
    }

    /**
     * Parameterized constructor to create an ApiRequest object.
     *
     * @param url        The endpoint URL of the API
     * @param method     The HTTP method (e.g., GET, POST)
     * @param headers    The headers to include in the request
     * @param parameters The query parameters
     * @param body       The request body
     */
    public ApiRequest(String url, String method, Map<String, String> headers, Map<String, String> parameters, String body) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.parameters = parameters;
        this.body = body;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
