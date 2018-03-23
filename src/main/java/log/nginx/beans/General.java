package log.nginx.beans;

import com.alibaba.fastjson.JSONArray;

public class General {
    private String start_date;
    private String end_date;
    private String date_time;
    private Long total_requests;
    private Long valid_requests;
    private Long failed_requests;
    private Long generation_time;
    private Long unique_visitors;
    private Long unique_files;
    private Long excluded_hits;
    private Long unique_referrers;
    private Long unique_not_found;
    private Long unique_static_files;
    private Long log_size;
    private Long bandwidth;
    private JSONArray log_path;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Long getTotal_requests() {
        return total_requests;
    }

    public void setTotal_requests(Long total_requests) {
        this.total_requests = total_requests;
    }

    public Long getValid_requests() {
        return valid_requests;
    }

    public void setValid_requests(Long valid_requests) {
        this.valid_requests = valid_requests;
    }

    public Long getFailed_requests() {
        return failed_requests;
    }

    public void setFailed_requests(Long failed_requests) {
        this.failed_requests = failed_requests;
    }

    public Long getGeneration_time() {
        return generation_time;
    }

    public void setGeneration_time(Long generation_time) {
        this.generation_time = generation_time;
    }

    public Long getUnique_visitors() {
        return unique_visitors;
    }

    public void setUnique_visitors(Long unique_visitors) {
        this.unique_visitors = unique_visitors;
    }

    public Long getUnique_files() {
        return unique_files;
    }

    public void setUnique_files(Long unique_files) {
        this.unique_files = unique_files;
    }

    public Long getExcluded_hits() {
        return excluded_hits;
    }

    public void setExcluded_hits(Long excluded_hits) {
        this.excluded_hits = excluded_hits;
    }

    public Long getUnique_referrers() {
        return unique_referrers;
    }

    public void setUnique_referrers(Long unique_referrers) {
        this.unique_referrers = unique_referrers;
    }

    public Long getUnique_not_found() {
        return unique_not_found;
    }

    public void setUnique_not_found(Long unique_not_found) {
        this.unique_not_found = unique_not_found;
    }

    public Long getUnique_static_files() {
        return unique_static_files;
    }

    public void setUnique_static_files(Long unique_static_files) {
        this.unique_static_files = unique_static_files;
    }

    public Long getLog_size() {
        return log_size;
    }

    public void setLog_size(Long log_size) {
        this.log_size = log_size;
    }

    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public JSONArray getLog_path() {
        return log_path;
    }

    public void setLog_path(JSONArray log_path) {
        this.log_path = log_path;
    }
}
