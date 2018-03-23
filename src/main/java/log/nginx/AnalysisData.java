package log.nginx;

public class AnalysisData {
    private String name;
    private Long hitCount;
    private Long visitorCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHitCount() {
        return hitCount;
    }

    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }

    public Long getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(Long visitorCount) {
        this.visitorCount = visitorCount;
    }
}
