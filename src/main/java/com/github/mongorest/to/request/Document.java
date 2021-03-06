package com.github.mongorest.to.request;

/**
 * For the 'json' attribute, use:<br>
 * String json = org.mongodb.util.JSON.serialize(object)<br>
 * 
 * To deserialize:<br>
 * BasicDBObject deserialized = JSON.parse(json);<br>
 */
public class Document {
    private String docId;
    private String json;

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Document [docId=").append(docId).append(", json=").append(json).append("]");
        return builder.toString();
    }
}
