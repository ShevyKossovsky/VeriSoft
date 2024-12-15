package ApiRequestBuilder;

import java.util.Map;

public interface IApiRequestBuilder {
    void buildURL(String url);

    void buildMethod(String method);

    void buildHeader(Map<String, String> headers);

    void buildParameter(Map<String, String> parameters);

    void buildBody(String body);

}
