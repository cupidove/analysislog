package log.nginx;

public class RequestData {

    private String num;

    private String column2;


    private String key;

    private String hits_count;


    private String hits_percent;


    private String visitors_count;


    private String visitors_percent;


    private String bytes_count;


    private String bytes_percent;


    private String method;


    private String protocol;


    private String url;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHits_count() {
        return hits_count;
    }

    public void setHits_count(String hits_count) {
        this.hits_count = hits_count;
    }

    public String getHits_percent() {
        return hits_percent;
    }

    public void setHits_percent(String hits_percent) {
        this.hits_percent = hits_percent;
    }

    public String getVisitors_count() {
        return visitors_count;
    }

    public void setVisitors_count(String visitors_count) {
        this.visitors_count = visitors_count;
    }

    public String getVisitors_percent() {
        return visitors_percent;
    }

    public void setVisitors_percent(String visitors_percent) {
        this.visitors_percent = visitors_percent;
    }

    public String getBytes_count() {
        return bytes_count;
    }

    public void setBytes_count(String bytes_count) {
        this.bytes_count = bytes_count;
    }

    public String getBytes_percent() {
        return bytes_percent;
    }

    public void setBytes_percent(String bytes_percent) {
        this.bytes_percent = bytes_percent;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
