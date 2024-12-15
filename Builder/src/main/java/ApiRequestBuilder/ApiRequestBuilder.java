package ApiRequestBuilder;

import java.util.Map;

public class ApiRequestBuilder implements IApiRequestBuilder {
    private ApiRequest apiRequest;

    @Override
    public void buildURL(String url) {
        this.apiRequest.setUrl(url);
    }

    @Override
    public void buildMethod(String method) {
        this.apiRequest.setMethod(method);
    }

    @Override
    public void buildHeader(Map<String, String> headers) {
        this.apiRequest.setHeaders(headers);
    }

    @Override
    public void buildParameter(Map<String, String> parameters) {
        this.apiRequest.setParameters(parameters);
    }

    @Override
    public void buildBody(String body) {
        this.apiRequest.setBody(body);
    }
}
