package log.nginx.beans;

import com.alibaba.fastjson.JSONArray;

public class Vhosts {
    private Metadata metadata;
    private JSONArray data;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public JSONArray getData() {
        return data;
    }

    public void setData(JSONArray data) {
        this.data = data;
    }
}
