package design_pattern_study.patterns.J2EE.intercpFilt;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
