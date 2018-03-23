package log.nginx.beans;

public class GoaccessRoot {
    private General general;
    private Visitors visitors;
    private Requests requests;
    private StaticRequests static_requests;
    private NotFound not_found;
    private Hosts hosts;
    private OS os;
    private Browsers browsers;
    private VisitTime visit_time;
    private Vhosts vhosts;
    private ReferringSites referring_sites;
    private StatusCodes status_codes;
    private Geolocation geolocation;

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public Visitors getVisitors() {
        return visitors;
    }

    public void setVisitors(Visitors visitors) {
        this.visitors = visitors;
    }

    public Requests getRequests() {
        return requests;
    }

    public void setRequests(Requests requests) {
        this.requests = requests;
    }

    public StaticRequests getStatic_requests() {
        return static_requests;
    }

    public void setStatic_requests(StaticRequests static_requests) {
        this.static_requests = static_requests;
    }

    public NotFound getNot_found() {
        return not_found;
    }

    public void setNot_found(NotFound not_found) {
        this.not_found = not_found;
    }

    public Hosts getHosts() {
        return hosts;
    }

    public void setHosts(Hosts hosts) {
        this.hosts = hosts;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Browsers getBrowsers() {
        return browsers;
    }

    public void setBrowsers(Browsers browsers) {
        this.browsers = browsers;
    }

    public VisitTime getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(VisitTime visit_time) {
        this.visit_time = visit_time;
    }

    public Vhosts getVhosts() {
        return vhosts;
    }

    public void setVhosts(Vhosts vhosts) {
        this.vhosts = vhosts;
    }

    public ReferringSites getReferring_sites() {
        return referring_sites;
    }

    public void setReferring_sites(ReferringSites referring_sites) {
        this.referring_sites = referring_sites;
    }

    public StatusCodes getStatus_codes() {
        return status_codes;
    }

    public void setStatus_codes(StatusCodes status_codes) {
        this.status_codes = status_codes;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }
}
