package log.nginx;

import com.alibaba.fastjson.JSON;
import com.opencsv.bean.CsvToBeanBuilder;
import log.nginx.beans.DataInRequests;
import log.nginx.beans.GoaccessRoot;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String filePath = "D:\\qdlog\\240history3.json";
        String fileName = "D:\\qdlog\\240history4.csv";
        String fileName2 = "D:\\qdlog\\m.csv";
        List requestLogs = new App().parseLogCsv(fileName);
        List mobileInterfaceList = new App().getMobileInterfaceList(fileName2);
        Map analysisMap = new HashMap<String, AnalysisData>();
        Map map = new App().getMobileInterfaceList(mobileInterfaceList);
        if (requestLogs != null && !requestLogs.isEmpty()) {
            for (int i = 0; i < requestLogs.size(); i++) {
                RequestData data = (RequestData) requestLogs.get(i);
                //分析移动端接口访问数量
                String key = StringUtils.substringBefore(data.getUrl(), "?");
                if (map.containsKey(key)) {
                    long hitCount = Long.parseLong(data.getHits_count());
                    long visitorCount = Long.parseLong(data.getVisitors_count());
                    if (!analysisMap.containsKey(key)) {
                        AnalysisData analysisData = new AnalysisData();
                        analysisData.setName((String) map.get(key));
                        analysisData.setHitCount(hitCount);
                        analysisData.setVisitorCount(visitorCount);
                        analysisMap.put(key, analysisData);
                    } else {
                        AnalysisData d = (AnalysisData) analysisMap.get(key);
                        d.setHitCount(d.getHitCount() + hitCount);
                        d.setVisitorCount(d.getVisitorCount() + visitorCount);
                    }

                }
            }
        }

        Iterator iterator = analysisMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, AnalysisData> entry = (Entry<String, AnalysisData>) iterator.next();
            System.out.println("\"" + entry.getValue().getName() + "\",\"" + entry.getValue().getHitCount() + "\"");
        }
    }

    public void parseLogJson(String filePath) {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            String logJsonStr = IOUtils.toString(inputStream);
            GoaccessRoot root = JSON.parseObject(logJsonStr, GoaccessRoot.class);
            List<DataInRequests> dataInRequests = JSON.parseArray(root.getRequests().getData().toJSONString(), DataInRequests.class);
            for (DataInRequests dr : dataInRequests) {
                System.out.println(dr.getData());
            }
            System.out.println("wwww");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List parseLogCsv(String fileName) {
        List resultList = new ArrayList();
        try {
            List list = new CsvToBeanBuilder(new FileReader(fileName)).withType(GoaccessCsv.class).build().parse();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    GoaccessCsv goaccessCsv = (GoaccessCsv) list.get(i);
                    if ("requests".equals(goaccessCsv.getColumn3())) {
                        RequestData data = new RequestData();
                        data.setNum(goaccessCsv.getColumn1());
                        data.setColumn2(goaccessCsv.getColumn2());
                        data.setKey(goaccessCsv.getColumn3());
                        data.setHits_count(goaccessCsv.getColumn4());
                        data.setHits_percent(goaccessCsv.getColumn5());
                        data.setVisitors_count(goaccessCsv.getColumn6());
                        data.setVisitors_percent(goaccessCsv.getColumn7());
                        data.setBytes_count(goaccessCsv.getColumn8());
                        data.setBytes_percent(goaccessCsv.getColumn9());
                        data.setMethod(goaccessCsv.getColumn10());
                        data.setProtocol(goaccessCsv.getColumn11());
                        data.setUrl(goaccessCsv.getColumn12());
                        resultList.add(data);
//                       System.out.println(goaccessCsv.getColumn12());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public List getMobileInterfaceList(String fileName) {
        List list = null;
        try {
            list = new CsvToBeanBuilder(new FileReader(fileName)).withType(MobileInterface.class).build().parse();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    MobileInterface mobileInterface = (MobileInterface) list.get(i);
//                    System.out.println(mobileInterface.getFunction());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map getMobileInterfaceList(List mobileInterfaceList) {
        Map map = new HashMap<String, String>();
        if (mobileInterfaceList != null && !mobileInterfaceList.isEmpty()) {
            for (int i = 0; i < mobileInterfaceList.size(); i++) {
                MobileInterface m = (MobileInterface) mobileInterfaceList.get(i);
                String url = m.getRequest();
                String key = StringUtils.substringBefore(url, "?");
                if (map.isEmpty() || !map.containsKey(key)) {
                    map.put(key, m.getFunction());
                } else {
                    String value = map.get(key) + "," + m.getFunction();
                    map.put(key, value);
                }
            }
        }
        return map;
    }
}
