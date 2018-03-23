package log.nginx.beans;

public class DataInRequests {
    private HitsInData hits;
    private VisitorsInData visitors;
    private BytesInData bytes;
    private String method;
    private String protocol;
    private String data;

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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
