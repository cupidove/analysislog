package log.nginx.beans;

import java.math.BigDecimal;

public class HitsInData {
    private Long cout;
    private BigDecimal percent;

    public Long getCout() {
        return cout;
    }

    public void setCout(Long cout) {
        this.cout = cout;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }
}
