package log.nginx.beans;

public class Metadata {
    private BytesInMeta bytes;
    private VisitorsInMeta visitors;
    private HitsInMeta hits;
    private DataInMeta data;

    public BytesInMeta getBytes() {
        return bytes;
    }

    public void setBytes(BytesInMeta bytes) {
        this.bytes = bytes;
    }

    public VisitorsInMeta getVisitors() {
        return visitors;
    }

    public void setVisitors(VisitorsInMeta visitors) {
        this.visitors = visitors;
    }

    public HitsInMeta getHits() {
        return hits;
    }

    public void setHits(HitsInMeta hits) {
        this.hits = hits;
    }

    public DataInMeta getData() {
        return data;
    }

    public void setData(DataInMeta data) {
        this.data = data;
    }
}
