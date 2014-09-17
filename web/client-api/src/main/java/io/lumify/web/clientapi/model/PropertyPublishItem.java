package io.lumify.web.clientapi.model;

import org.json.JSONObject;

public class PropertyPublishItem extends PublishItem {
    private final String elementId;
    private final String propertyKey;
    private final String propertyName;

    public PropertyPublishItem(String elementId, String propertyKey, String propertyName) {
        this.elementId = elementId;
        this.propertyKey = propertyKey;
        this.propertyName = propertyName;
    }

    @Override
    public JSONObject getJson() {
        JSONObject json = new JSONObject();
        json.put("type", "property");
        json.put("action", "");
        json.put("vertexId", elementId);
        json.put("key", propertyKey);
        json.put("name", propertyName);
        return json;
    }
}
