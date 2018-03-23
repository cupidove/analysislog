package log.nginx.beans;

import com.alibaba.fastjson.JSONArray;

public class DataInOS {
    private HitsInData hits;
    private VisitorsInData visitors;
    private BytesInData bytes;
    private String data;
    private JSONArray items;

    public HitsInData getHits() {
        return hits;
    }

    public void setHits(HitsInData hits) {
        this.hits = hits;
    }

    public VisitorsInData getVisitors() {
        return visitors;
    }

    public void setVisitors(VisitorsInData visitors) {
        this.visitors = visitors;
    }

    public BytesInData getBytes() {
        return bytes;
    }

    public void setBytes(BytesInData bytes) {
        this.bytes = bytes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public JSONArray getItems() {
        return items;
    }

    public void setItems(JSONArray items) {
        this.items = items;
    }
}
