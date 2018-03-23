package log.nginx;

import com.opencsv.bean.CsvBindByPosition;

public class MobileInterface {
    @CsvBindByPosition(position = 0)
    private String request;

    @CsvBindByPosition(position = 1)
    private String method;

    @CsvBindByPosition(position = 2)
    private String function;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
