package JSONBuilder;

/**
 * Created by mikhailovra on 02.09.2017.
 */
public class JSONObject extends Object {
    private String begin = "{";
    private String end = "}";
    private String body;

    private String jsonObject;



    public JSONObject jsonObject(){
        return this;
    };


    @Override
    public String toString(){
        return begin + body + end;
    }

    public JSONObject addValue(String key, String value){
        this.body = body + "\n  \"" + key + "\":\"" + value + "\"";
        return this;
    }

    public JSONObject addValue(String key, String value, boolean isFirst){
        this.body = body + "," + "\n  \"" + key + "\":\"" + value + "\"";
        return this;
    }

    public String getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(String jsonObject) {
        this.jsonObject = jsonObject;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
