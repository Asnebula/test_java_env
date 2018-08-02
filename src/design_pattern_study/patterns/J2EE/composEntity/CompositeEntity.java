package design_pattern_study.patterns.J2EE.composEntity;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
